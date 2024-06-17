package com.STD22109;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lieux A = new Lieux("A");
        Lieux B = new Lieux("B");
        Lieux C = new Lieux("C");
        Lieux D = new Lieux("D");
        Lieux E = new Lieux("E");
        Lieux F = new Lieux("F");
        Lieux G = new Lieux("G");
        Rue rue1 = new Rue(A , "rue1" , B);
        Rue rue2 = new Rue(B , "rue2" , C);
        Rue rue3 = new Rue(C , "rue3" , D);
        Rue rue4 = new Rue(C , "rue4" , E);
        Rue rue5 = new Rue(E, "rue5" , G);
        Rue rue6 = new Rue(E , "rue6", F);

        Carte carte = new Carte(List.of(rue1, rue2 , rue3 , rue4 , rue5 , rue6));



        Marcheur kev = new Marcheur("kev" , A , E);
        System.out.println(kev.direction(carte));


    }
}