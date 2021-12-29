package com.wlabs.parkoo.backend.database;

import com.wlabs.parkoo.backend.*;
import java.util.List;

/**
 * @param <Object>
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 */
public class DatabaseManagement<Object> {

    public static int findTableIndex(String table) {
        int tableIndex = 0;
        String[] allTable = {"caissiers", "clients", " ventes", "voitures"};

        for (int i = 0; i < allTable.length; i++) {
            if (table.equals(allTable[i])) {
                tableIndex = i;
            }else{
                tableIndex = -1;
            }
        }
        return tableIndex;
    }

    public List selectAllFrom(String myTable) {
        int myTableIndex = findTableIndex(myTable);
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
}
