package com.training_daily.day02_code.threaddemo;

public class BaoZiPu extends Thread {
    private BaoZi bz;
    public BaoZiPu(BaoZi bz){
        this.bz = bz;
    }
    public void run(){
        int count = 0;
        while(true){
            synchronized(bz){
                if(bz.flag == true){
                    try{
                        bz.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                if(count % 2 == 0){
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                }else{
                    bz.pi = "冰皮";
                    bz.xian = "牛肉馅";
                }
                count++;
                System.out.println("包子铺正在生产：");
                try{
                    Thread.sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("包子铺生产好了:" + bz.pi + bz.xian + "包子已经做好了");
            }
        }
    }
}
