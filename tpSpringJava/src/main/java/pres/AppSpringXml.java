package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Imetier;

public class AppSpringXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); //read xml file
        Imetier metier = context.getBean(Imetier.class);
        System.out.println(metier.calcul());

    }
}
