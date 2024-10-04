package pres;

import diao.*;
import ext.*;
import metier.*;

public class presentation {
    public static void main(String[] args) {

        // injection des dependances par instanciation static ( "new" = couplage fort)!!!
        DaoImpl2 d = new DaoImpl2();
        MetierImpl metier = new MetierImpl(d);

        metier.setDao(d); //injection de dependence => satisfaction de depondance
        System.out.println("Resultat ="+metier.calcul());


    }
}
