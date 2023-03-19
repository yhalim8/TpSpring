package pres;

import dao.DaoImpl;
import service.MetierImpl;

public class presentation {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl(); //couplage fort instanciation statique
        MetierImpl metier = new MetierImpl(dao); //injection via constructeur
        //injection des dependences
        //metier.setDao(dao);
        double res = metier.calcul();
        System.out.println("result de calcul est "+ res);
    }
}
