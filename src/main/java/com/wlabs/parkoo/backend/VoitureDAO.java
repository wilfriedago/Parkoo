package com.wlabs.parkoo.backend;

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
            //Temporary Voiture object
            Voiture car = null;
            //While we still have records
            while (allDBCars.next()) {
                car.setNumSerie(allDBCars.getString("vonumserie"));
                car.setMarque(allDBCars.getString("vomarque"));
                car.setModele(allDBCars.getString("vomodele"));
                car.setCouleur(allDBCars.getString("vocouleur"));
                car.setPrixAchat(allDBCars.getDouble("voprixachat"));
                car.setPrixVente(allDBCars.getDouble("voprixvente"));

                //And now, we add this car to the list Vrooum! Vrooom! :D
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
        Voiture car = null;
        try {
            PreparedStatement findVoiture = this.connect.prepareStatement("SELECT * FROM public.voitures WHERE vonumserie = '?'");
            findVoiture.setString(1, id);

            car = (Voiture) findVoiture.executeQuery();
            this.connect.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return car;
    }

    @Override
    public int insert(Voiture obj) {
        int resultOfQuery;
        try {
            PreparedStatement insertVoiture = this.connect.prepareStatement("INSERT INTO public.voitures(vonumserie, vomarque, vomodele, vocouleur, voprixachat, voprixvente) VALUES ('?', '?', '?', '?', ?, ?)");
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
            PreparedStatement updateVoiture = this.connect.prepareStatement("UPDATE public.voitures SET vonumserie = ?, vomarque = ?, vomodele = ?, vocouleur = ?, voprixachat = ?, voprixvente = ?Z WHERE <condition>");
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
    public int delete(Voiture obj) {
        int resultOfQuery;
        try {
            PreparedStatement deleteVoiture = this.connect.prepareStatement("DELETE FROM public.voitures WHERE vonumserie ='?'");
            deleteVoiture.setString(1, obj.getNumSerie());

            resultOfQuery = deleteVoiture.executeUpdate();
            this.connect.close();
        } catch (SQLException e) {
            resultOfQuery = 0;
            System.out.println(e);
        }
        return resultOfQuery;
    }

}
