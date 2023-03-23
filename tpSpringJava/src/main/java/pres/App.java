package pres;

import dao.DaoImpl;
import dao.IDao;
import service.Imetier;
import service.ImetierImpl;

public class App {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        ImetierImpl metier = new ImetierImpl(dao);
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
