package com.wlabs.parkoo.backend;

import com.wlabs.parkoo.backend.database.CaissierDAO;
import com.wlabs.parkoo.backend.database.ClientDAO;
import com.wlabs.parkoo.backend.database.VenteDAO;
import com.wlabs.parkoo.backend.database.VoitureDAO;
import java.util.List;

/**
 *
 * @author Wlabs
 */
public class Test {

    public static List selectAllFrom(String myTable) {
        int myTableIndex = 0;
        String[] allTables = {"caissiers", "clients", " ventes", "voitures"};

        for (int i = 0; i < allTables.length; i++) {
            if (myTable.equals(allTables[i])) {
                myTableIndex = i;
            } else {
                myTableIndex = -1;
            }
        }

        switch (myTableIndex) {
            case 0 -> {
                CaissierDAO caissierDAO = new CaissierDAO();
                List<Caissier> allCashiers = caissierDAO.selectAll();
                return allCashiers;
            }
            case 1 -> {
                ClientDAO clientDAO = new ClientDAO();
                List<Client> allCustomers = clientDAO.selectAll();
                return allCustomers;
            }
            case 2 -> {
                VenteDAO venteDAO = new VenteDAO();
                List<Vente> allSales = venteDAO.selectAll();
                return allSales;
            }
            case 3 -> {
                VoitureDAO voitureDAO = new VoitureDAO();
                List<Voiture> allCars = voitureDAO.selectAll();
                return allCars;
            }
            default -> {
                return null;
            }
        }
    }

    public static void main(String args[]) {

        List allRows = selectAllFrom("voitures");

        if (allRows == null) {
            System.out.println("This table is empty !");
        } else {
            for (int i = 0; i < allRows.size(); i++) {
                System.out.println(allRows.get(i).toString());
            }
        }

    }
}
