package com.interfacedemo.Electronic_equipment;

public class Keyboard implements USB {
    public void open(){
        System.out.println("打开键盘");
    }
    public void close(){
        System.out.println("关闭键盘");
    }
    public void type(){
        System.out.println("键盘输入");
    }
}
