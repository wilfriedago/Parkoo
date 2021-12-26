package com.wlabs.parkoo.backend;

import java.util.Date;

/**
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 */
public class Vente {

    private String id;
    private Date dateVente;
    private double prix;

    //Class Constructor
    public Vente(String id, Date dateVente, double prix) {
        this.id = id;
        this.dateVente = dateVente;
        this.prix = prix;
    }

    //Getters
    public String getId() {
        return id;
    }

    public Date getDateVente() {
        return dateVente;
    }

    public double getPrix() {
        return prix;
    }

    //Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    //To String Method
    @Override
    public String toString() {
        return "Vente{" + "id=" + id + ", dateVente=" + dateVente + ", prix=" + prix + '}';
    }

}
