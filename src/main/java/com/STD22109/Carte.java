package com.STD22109;

import java.util.*;

public class Carte {
    private final List<Rue> rues;

    public Carte(List<Rue> rues) {
        this.rues = rues;
    }

    public List<Rue> getRues() {
        return rues;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "lieux=" + rues +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carte carte = (Carte) o;
        return Objects.equals(rues, carte.rues);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rues);
    }

    public List<Rue> possibilite(Lieux lieux, Carte carte) {
        return carte.getRues().stream().filter(rue -> rue.getExtremite1().equals(lieux) || rue.getExtremite2().equals(lieux)).toList();

    }
}
