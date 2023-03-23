package dao;

import org.springframework.stereotype.Component;

@Component
public class VideoProjecteur implements Vga{
    @Override
    public void print(String message) {
        System.out.println("video Projecteur   :"+ message);
    }
}
