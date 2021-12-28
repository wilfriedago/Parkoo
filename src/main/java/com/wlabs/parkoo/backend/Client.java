package com.wlabs.parkoo.backend;

import java.util.Date;

/**
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 */
public class Client extends Vente {

    private Integer idCl;
    private String name;
    private String email;
    private String telephone;

    public Client(Integer idCl, String name, String email, String telephone, String idVe, Date dateVente, double prix) {
        super(idVe, dateVente, prix);
        this.idCl = idCl;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }

    //Getters
    public Integer getIdCl() {
        return idCl;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    //Setters
    public void setIdCl(Integer idCl) {
        this.idCl = idCl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
