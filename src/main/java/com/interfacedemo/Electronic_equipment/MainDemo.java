package com.interfacedemo.Electronic_equipment;

public class MainDemo {
    public static void main(String[] args){
        Computer computer = new Computer();
        computer.powerOn();
        Mouse mouse = new Mouse();
        computer.useDevice(mouse);
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);
        computer.powerOff();
    }
}
