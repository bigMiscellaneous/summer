package com.training_daily.day02_code.threaddemo;

public class Demo {
    public static void main(String[] args){
        BaoZi baozi = new BaoZi();
        new BaoZiPu(baozi).start();
        new Eater(baozi).start();
    }
}
