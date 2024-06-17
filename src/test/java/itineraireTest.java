import com.STD22109.Carte;
import com.STD22109.Lieux;
import com.STD22109.Marcheur;
import com.STD22109.Rue;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class itineraireTest {
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
    Carte carte = new Carte(List.of(rue1 , rue2 , rue3 , rue4 , rue5 , rue6));

    @Test
    void tester_valeur_depart_et_arrive (){
        var depart = A;
        var arrivee = E;
        var kev = new Marcheur("kev" , depart , arrivee);
        var itineraire = kev.direction(carte);
        assertTrue(itineraire.get(0).equals(depart) &&
                itineraire.get(itineraire.size()-1).equals(arrivee));

    }
}
