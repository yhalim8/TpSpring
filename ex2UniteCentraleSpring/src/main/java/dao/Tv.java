package dao;

import org.springframework.stereotype.Component;

@Component
public class Tv implements Hdmi{
    @Override
    public void print(byte[] data) {
        String d = new String(data);
        System.out.println("tv : "+ d);
    }
}
