package com.STD22109;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lieux marais = new Lieux("marais");
        Lieux sekoly = new Lieux("sekoly");
        Lieux hei = new Lieux("hei");
        Rue rue1 = new Rue(marais , "rue1" , sekoly);
        Rue rue2 = new Rue(sekoly , "rue2" , hei);

        Carte carte = new Carte(List.of(rue1, rue2));

        Marcheur marcheur = new Marcheur("marc",marais,hei);
        System.out.println(marcheur.direction(carte));
    }
}