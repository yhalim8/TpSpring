package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.Imetier;

public class AppSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","service");
        Imetier metier = context.getBean(Imetier.class);

        System.out.println(metier.calcul());
    }
}
