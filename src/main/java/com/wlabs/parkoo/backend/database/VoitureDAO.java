package com.wlabs.parkoo.backend.database;

import com.wlabs.parkoo.backend.Voiture;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 */
public class VoitureDAO extends DAO<Voiture> {

    @Override
    public List<Voiture> selectAll() {
        List<Voiture> allCarsList = new ArrayList<>();

        try {
            ResultSet allDBCars = this.connect.createStatement().executeQuery("SELECT * FROM public.voitures");

            while (allDBCars.next()) {
                Voiture car = new Voiture(allDBCars.getString("vonumserie"), allDBCars.getString("vomarque"), allDBCars.getString("vomodele"), allDBCars.getString("vocouleur"), allDBCars.getDouble("voprixachat"), allDBCars.getDouble("voprixvente"));
                allCarsList.add(car);
            }
            this.connect.createStatement().close();
            this.connect.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

        return allCarsList;
    }

    @Override
    public Voiture findById(String id) {
        try {
            PreparedStatement findVoiture = this.connect.prepareStatement("SELECT * FROM public.voitures WHERE vonumserie = ? LIMIT 1");
            findVoiture.setString(1, id);

            ResultSet result = findVoiture.executeQuery();

            if (result.next() && !"".equals(result.getString("vonumserie"))) {
                Voiture car = new Voiture(result.getString("vonumserie"), result.getString("vomarque"), result.getString("vomodele"), result.getString("vocouleur"), result.getDouble("voprixachat"), result.getDouble("voprixvente"));
                this.connect.close();
                return car;
            } else {
                this.connect.close();
                return null;
            }
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public int insert(Voiture obj) {
        int resultOfQuery;
        try {
            PreparedStatement insertVoiture = this.connect.prepareStatement("INSERT INTO public.voitures VALUES (?, ?, ?, ?, ?, ?)");
            insertVoiture.setString(1, obj.getNumSerie());
            insertVoiture.setString(2, obj.getMarque());
            insertVoiture.setString(3, obj.getModele());
            insertVoiture.setString(4, obj.getCouleur());
            insertVoiture.setDouble(5, obj.getPrixAchat());
            insertVoiture.setDouble(6, obj.getPrixVente());

            resultOfQuery = insertVoiture.executeUpdate();
        } catch (SQLException e) {
            resultOfQuery = 0;
            System.out.println(e);
        }
        return resultOfQuery;
    }

    @Override
    public int update(Voiture obj) {
        int resultOfQuery;
        try {
            PreparedStatement updateVoiture = this.connect.prepareStatement("UPDATE public.voitures SET vonumserie = ?, vomarque = ?, vomodele = ?, vocouleur = ?, voprixachat = ?, voprixvente = ? WHERE <condition>");
            updateVoiture.setString(1, obj.getNumSerie());
            updateVoiture.setString(2, obj.getMarque());
            updateVoiture.setString(4, obj.getCouleur());
            updateVoiture.setString(3, obj.getModele());
            updateVoiture.setDouble(5, obj.getPrixAchat());
            updateVoiture.setDouble(6, obj.getPrixVente());

            resultOfQuery = updateVoiture.executeUpdate();
            this.connect.close();
        } catch (SQLException e) {
            resultOfQuery = 0;
            System.out.println(e);
        }
        return resultOfQuery;
    }

    @Override
    public int delete(String id) {
        int resultOfQuery;
        try {
            PreparedStatement deleteVoiture = this.connect.prepareStatement("DELETE FROM public.voitures WHERE vonumserie = ?");
            deleteVoiture.setString(1, id);

            resultOfQuery = deleteVoiture.executeUpdate();
            this.connect.close();
        } catch (SQLException e) {
            resultOfQuery = 0;
            System.out.println(e);
        }
        return resultOfQuery;
    }

}
