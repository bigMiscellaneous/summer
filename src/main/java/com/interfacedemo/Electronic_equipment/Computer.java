package com.interfacedemo.Electronic_equipment;

public class Computer {
    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关机");
    }
    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }
        else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.type();
        }
        usb.close();
    }
}
