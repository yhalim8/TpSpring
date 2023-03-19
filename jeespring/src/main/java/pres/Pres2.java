package pres;

import dao.IDao;
import service.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        String metierClassName = scanner.nextLine();
        Class cdao = Class.forName(daoClassName); //forname il va verifier si la classe existe il va le charger
        //dans la memoire ** new DaoImpl
        IDao dao =(IDao)cdao.getConstructor().newInstance(); //creation d'un objet de class
        Class cmetier = Class.forName(metierClassName);
        //IMetier metier = (IMetier) cmetier.newInstance();
        IMetier metier = (IMetier) cmetier.getConstructor(IDao.class).newInstance(dao);
        //metier.setDao(dao)  statique
       // Method setDao = metier.getClass().getDeclaredMethod("setDao",IDao.class); //injection via le constructeur
       // setDao.invoke(metier,iDao); //injection des dependences dynamique
        System.out.println(metier.calcul());
        /*  application carrement fermer a la modification et ouvert a l'extention */
    }
}
