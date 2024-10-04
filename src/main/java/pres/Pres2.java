package pres;

import diao.*;
import metier.*;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

public class Pres2 {
    public static void main(String[] args) throws Exception{
        // instanciation dinamique

//        lire les fichier de config
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine(); // lire premier ligne du fichier config

        //charger la class dans la memoire
        Class cDao=Class.forName(daoClassName);
        // "forName" on donne le nom de la class et il cherche si la class existe
        /* tous les class et les interface son charger dans la memoire sous form
         de class de type Class */

        // instanciation de la class (inst dinamic)
        // cast
        IDao dao=(IDao) cDao.newInstance();

//        creation objet metier

        String metierClassName = scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
//        IMetier metier = (IMetier) cMetier.newInstance();
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        Method method = cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);

        System.out.println("Resultat : "+metier.calcul());

    }
}
