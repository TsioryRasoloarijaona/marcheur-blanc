package com.STD22109;

import java.util.*;

public class Marcheur {
    private final String nom;
    private Lieux depart;
    private Lieux arrivee;

    public Marcheur(String nom, Lieux depart, Lieux arrivee) {
        this.nom = nom;
        this.depart = depart;
        this.arrivee = arrivee;
    }

    public String getNom() {
        return nom;
    }

    public Lieux getDepart() {
        return depart;
    }

    public void setDepart(Lieux depart) {
        this.depart = depart;
    }

    public Lieux getArrivee() {
        return arrivee;
    }

    public void setArrivee(Lieux arrivee) {
        this.arrivee = arrivee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marcheur marcheur = (Marcheur) o;
        return Objects.equals(nom, marcheur.nom) && Objects.equals(depart, marcheur.depart) && Objects.equals(arrivee, marcheur.arrivee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, depart, arrivee);
    }

    @Override
    public String toString() {
        return "Marcheur{" +
                "nom='" + nom + '\'' +
                ", depart=" + depart +
                ", arrivee=" + arrivee +
                '}';
    }

    public List<Lieux> direction (Carte carte){
        List<Lieux> directions = new ArrayList<>();
        directions.add(depart);

        while (!depart.equals(arrivee)) {
            Rue prochains = null;

            for (Rue rue : carte.getRues()) {
                if (depart.equals(rue.getExtremite1())) {
                    prochains = rue;
                    setDepart(rue.getExtremite2());
                    break;
                } else if (depart.equals(rue.getExtremite2())) {
                    prochains = rue;
                    setDepart(rue.getExtremite1());
                    break;
                }
            }

            directions.add(depart);
        }

        return directions;
    }
}
