package ext;

import diao.*;

public class DaoImplWS implements IDao {
    @Override
    public double getData() {
        System.out.println("Version WEB SERVICE : ");
        return 90;
    }
}
