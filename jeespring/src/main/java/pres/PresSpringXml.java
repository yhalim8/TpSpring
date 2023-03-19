package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IMetier;

public class PresSpringXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");  //read xml file
        IMetier metier = context.getBean(IMetier.class); //give me bean which type is IMetier
        System.out.println(metier.calcul());
    }
}
