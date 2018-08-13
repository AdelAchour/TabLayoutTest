package com.production.achour_ar.tablayouttest;

public class Model {

    String Nom, Prenom;
    int Age;

    public Model(String nom, String prenom, int age) {
        Nom = nom;
        Prenom = prenom;
        Age = age;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}