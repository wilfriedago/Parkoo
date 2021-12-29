package com.wlabs.parkoo.backend;

/**
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 */
public class Voiture {

    private String numSerie;
    private String marque;
    private String modele;
    private String couleur;
    private double prixAchat;
    private double prixVente;

    //Constructor
    public Voiture(String numSerie, String marque, String modele, String couleur, double prixAchat, double prixVente) {
        this.numSerie = numSerie;
        this.marque = marque;
        this.modele = modele;
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

    public String getModele() {
        return modele;
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

    public void setModele(String modele) {
        this.modele = modele;
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

    //Methods
    @Override
    public String toString() {
        return " NumSerie : " + numSerie
                + "\n Marque : " + marque
                + "\n Modele : " + modele
                + "\n Couleur : " + couleur
                + "\n PrixAchat : " + prixAchat
                + "\n PrixVente : " + prixVente
                + "\n";
    }

}
