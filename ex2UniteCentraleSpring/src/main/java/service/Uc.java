package service;

import dao.Usb;
import dao.Vga;
import org.springframework.stereotype.Component;

@Component
public class Uc {
    Usb usb ;
    Vga vga ;

    public Uc(Usb usb, Vga vga) {
        this.usb = usb;
        this.vga = vga;
    }
    public int readData(){
        return usb.read();
    }
    public void printData(String data){
         vga.print(data);
    }
}
