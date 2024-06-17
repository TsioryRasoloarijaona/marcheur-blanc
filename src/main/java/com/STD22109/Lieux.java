package com.STD22109;

import java.util.List;
import java.util.Objects;

public class Lieux {
   private String nom;

    public Lieux(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lieux lieux = (Lieux) o;
        return Objects.equals(nom, lieux.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }

    @Override
    public String toString() {
        return "Lieux{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
