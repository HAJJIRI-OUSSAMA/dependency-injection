package ext;

import diao.*;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version Capteur");
        double temp = 2000 ;
        return temp;
    }
}
