package com.training_daily.day02_code.threaddemo;

public class Eater extends Thread {
    private BaoZi bz;
    public Eater(BaoZi bz){
        this.bz = bz;
    }
    public void run(){
        synchronized(bz){
            if(bz.flag == false){
                try{
                    bz.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("吃货正在吃：" + bz.pi + bz.xian);
            System.out.println("----------------------------------");
            bz.flag = false;
            bz.notify();
        }
    }
}
