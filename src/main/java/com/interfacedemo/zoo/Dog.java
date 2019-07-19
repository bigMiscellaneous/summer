package com.interfacedemo.zoo;

public class Dog implements Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void sleep(){
        System.out.println("狗会睡觉");
    }
    public void lookHome(){
        System.out.println("狗会看家");
    }
}
