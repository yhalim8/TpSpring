package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Uc;

public class AppXmlSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Uc uc = context.getBean(Uc.class);
        uc.printData("hello world");
        System.out.println(uc.readData());
    }
}
