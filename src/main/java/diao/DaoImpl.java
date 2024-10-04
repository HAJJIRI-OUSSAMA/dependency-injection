package diao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {

//        se connecter a la base de donnee pour recupere la temperature
        System.out.println("Version base de donnee");
        double temp=Math.random()*40;

        return temp;
    }
}
