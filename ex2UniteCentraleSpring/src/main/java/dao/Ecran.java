package dao;

import org.springframework.stereotype.Component;

@Component
public class Ecran implements Vga{
    @Override
    public void print(String message) {
        System.out.println("ecran : "+ message);
    }
}
