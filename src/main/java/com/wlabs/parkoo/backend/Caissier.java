package com.wlabs.parkoo.backend;

import java.util.Date;

/**
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 */
public class Caissier extends Vente {

    private Integer idCa;
    private String name;

    //Constructor
    public Caissier(Integer idCa, String name, String idVe, Date dateVente, double prix) {
        super(idVe, dateVente, prix);
        this.idCa = idCa;
        this.name = name;
    }

    //Getters
    public Integer getIdCa() {
        return idCa;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setIdCa(Integer idCa) {
        this.idCa = idCa;
    }

    public void setName(String name) {
        this.name = name;
    }

}
