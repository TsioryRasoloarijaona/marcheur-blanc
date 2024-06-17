package com.STD22109;

import java.util.Objects;

public class Rue {
   private Lieux extremite1;
   private String liaison ;
   private Lieux extremite2;

    public Rue(Lieux extremite1, String liaison, Lieux extremite2) {
        this.extremite1 = extremite1;
        this.liaison = liaison;
        this.extremite2 = extremite2;
    }

    public Lieux getExtremite1() {
        return extremite1;
    }

    public void setExtremite1(Lieux extremite1) {
        this.extremite1 = extremite1;
    }

    public String getLiaison() {
        return liaison;
    }

    public void setLiaison(String liaison) {
        this.liaison = liaison;
    }

    public Lieux getExtremite2() {
        return extremite2;
    }

    public void setExtremite2(Lieux extremite2) {
        this.extremite2 = extremite2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rue rue = (Rue) o;
        return Objects.equals(extremite1, rue.extremite1) && Objects.equals(liaison, rue.liaison) && Objects.equals(extremite2, rue.extremite2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extremite1, liaison, extremite2);
    }

    @Override
    public String toString() {
        return "Rue{" +
                "extremite1=" + extremite1 +
                ", liaison='" + liaison + '\'' +
                ", extremite2=" + extremite2 +
                '}';
    }
}
