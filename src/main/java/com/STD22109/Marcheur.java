package com.STD22109;

import java.util.*;
import java.util.stream.Collectors;

public class Marcheur {
    private final String nom;
    private Lieux depart;
    private final Lieux arrivee;

    public Marcheur(String nom, Lieux depart, Lieux arrivee) {
        this.nom = nom;
        this.depart = depart;
        this.arrivee = arrivee;

    }


    public void setDepart(Lieux depart) {
        this.depart = depart;
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
        Random random = new Random();
        List<Lieux> trajets = new ArrayList<>();
        trajets.add(depart);

        while (!depart.equals(arrivee)){
            List<Rue> possiblities = carte.possibilite(depart , carte);
            int indexChoisi = random.nextInt(possiblities.size());
            Rue rueChoisi = possiblities.get(indexChoisi);

            if (rueChoisi.getExtremite1().equals(depart)){
                setDepart(rueChoisi.getExtremite2());
                trajets.add(depart);
            }else {
                setDepart(rueChoisi.getExtremite1());
                trajets.add(depart);
            }

        }
        return trajets;

    }
}
