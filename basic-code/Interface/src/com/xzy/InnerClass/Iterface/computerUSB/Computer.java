package com.xzy.InnerClass.Iterface.computerUSB;

public class Computer {

    public void powerOn(){
        System.out.println("电脑开机");
    }

    public void powerOff(){
        System.out.println("电脑关机");
    }

    public void useUSB(USB usb){
        usb.open();
        if (usb instanceof Mouse){
            ((Mouse) usb).click();
        }else if (usb instanceof Keyboard){
            ((Keyboard) usb).qiaoji();
        }
        usb.close();
    }

}
