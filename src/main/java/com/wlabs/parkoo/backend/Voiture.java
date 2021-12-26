package com.wlabs.parkoo.backend;

/**
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 */
public class Voiture {

    private String numSerie;
    private String marque;
    private String couleur;
    private double prixAchat;
    private double prixVente;

    //Class Constructor
    public Voiture(String numSerie, String marque, String couleur, double prixAchat, double prixVente) {
        this.numSerie = numSerie;
        this.marque = marque;
        this.couleur = couleur;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
    }

    //Getters
    public String getNumSerie() {
        return numSerie;
    }

    public String getMarque() {
        return marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public double getPrixVente() {
        return prixVente;
    }

    //Setters
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    //Méthode getBenefice, permet de calculer le bénéfice réaliser sur une vente
    public double getBenefice() {
        return prixVente - prixAchat;
    }

    //To String Method
    @Override
    public String toString() {
        return "Voiture{" + "numSerie=" + numSerie + ", marque=" + marque + ", couleur=" + couleur + ", prixAchat=" + prixAchat + ", prixVente=" + prixVente + '}';
    }

}
