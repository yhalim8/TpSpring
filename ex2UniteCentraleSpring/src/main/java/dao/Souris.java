package dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Souris implements Usb{
    @Override
    public int read() {
        System.out.println("im mouse");
        return (int)(Math.random()*100);
    }
}
