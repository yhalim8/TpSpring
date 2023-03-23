package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.Uc;

public class AppAnottationSpring {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","service");
        Uc uc = context.getBean(Uc.class);
        uc.printData("hello world");
        System.out.println(uc.readData());
    }
}
