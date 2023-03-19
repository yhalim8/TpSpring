package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.IMetier;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ext","service");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
