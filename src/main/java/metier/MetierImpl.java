package metier;

import diao.*;

public class MetierImpl implements IMetier {

//    Couplage faible
    private IDao dao ;
    @Override
    public double calcul() {

        double tmp = dao.getData();
        double res = tmp*39/Math.cos(tmp*Math.PI);

        return res;
    }

//    Injecter dans la variable dao un objetd d'une classe qui implemente l'interface IDao

    //via constructeur
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    // via seters
    public void setDao(IDao dao) {

        this.dao = dao;

    }
}
