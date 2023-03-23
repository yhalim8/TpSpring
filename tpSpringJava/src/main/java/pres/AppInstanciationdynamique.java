package pres;
import dao.IDao;
import service.Imetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class AppInstanciationdynamique {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String cdao = scanner.nextLine();
        String cmetier = scanner.nextLine();

        Class dao = Class.forName(cdao);
        IDao dao1 = (IDao) dao.newInstance();

        Class metier = Class.forName(cmetier);
        Imetier metier1 = (Imetier) metier.newInstance();
        Method setDao = metier1.getClass().getMethod("setDao",IDao.class);
        setDao.invoke(metier1,dao1);  //injection des dependences par instanciation dynamique
        System.out.println(metier1.calcul());
    }
}
