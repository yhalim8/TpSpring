package dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class HdmiVgaAdapter implements Vga{
    private Hdmi hdmi;
    public HdmiVgaAdapter(Hdmi hdmi) {
        this.hdmi = hdmi;
    }

    public void print(String s){
        byte[] b = s.getBytes();
        hdmi.print(b);
    }
}
