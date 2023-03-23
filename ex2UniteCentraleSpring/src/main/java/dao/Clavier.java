package dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Clavier implements Usb{
    @Override
    public int read() {
        System.out.println("im keyboard");
        return (int)(Math.random()*100);
    }
}
