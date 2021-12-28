package com.wlabs.parkoo.backend;

import java.util.Date;

/**
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 */
public class Vente {

    private String idVe;
    private Date dateVente;
    private double prix;

    //Constructor
    public Vente(String idVe, Date dateVente, double prix) {
        this.idVe = idVe;
        this.dateVente = dateVente;
        this.prix = prix;
    }

    //Getters
    public String getIdVe() {
        return idVe;
    }

    public Date getDateVente() {
        return dateVente;
    }

    public double getPrix() {
        return prix;
    }

    //Setters
    public void setIdVe(String idVe) {
        this.idVe = idVe;
    }

    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

}
