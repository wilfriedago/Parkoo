package com.wlabs.parkoo.backend;

/**
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 */
public class Caissier {

    private Integer id;
    private String name;

    //Class Constructor
    public Caissier(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    //Getters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    //To String Method
    @Override
    public String toString() {
        return "Caissier{" + "id=" + id + ", name=" + name + '}';
    }

}
