package com.wlabs.parkoo.backend.database;

import com.wlabs.parkoo.backend.Voiture;
import com.wlabs.parkoo.backend.VoitureDAO;
import java.util.List;

/**
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 */
public class TestDAO {

    public static void main(String[] args) {
        VoitureDAO voitureDAO = new VoitureDAO();

        //Test selectAll
        List<Voiture> allDBCars = voitureDAO.selectAll();
        for (Voiture car : allDBCars) {
            System.out.println(car.toString());
        }

        //Test INSERT
        Voiture gwagon = new Voiture("gw300", "toyota", "gwagon5655", "rouge", 5000.5, 60000);
        if (voitureDAO.insert(gwagon) > 0) {
            System.out.println("Big OK !\n\n");
        } else {
            System.out.println("Big Error !");
        }
    }
}
