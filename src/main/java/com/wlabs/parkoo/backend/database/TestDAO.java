package com.wlabs.parkoo.backend.database;

import com.wlabs.parkoo.backend.Voiture;
import java.util.ArrayList;
import java.util.List;

/**
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 */
public class TestDAO {

    public static Voiture findVoitureById(String numSerie) {
        VoitureDAO voitureDAO = new VoitureDAO();

        if (voitureDAO.findById(numSerie) != null) {
            return voitureDAO.findById(numSerie);
        } else {
            return null;
        }
    }

    public static int deleteCar(String numSerie) {
        VoitureDAO voitureDAO = new VoitureDAO();
        return voitureDAO.delete(numSerie);
    }

    public static void main(String[] args) {
        System.out.println(findVoitureById("gw300").toString());
        
        
        //System.out.println(deleteCar("gw300")+" suppression");
        
        

    }
}
