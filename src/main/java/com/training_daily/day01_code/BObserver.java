package com.training_daily.day01_code;
import java.util.Observer;
import java.util.Observable;
public class BObserver implements Observer {
    public void update(Observable arg0,Object arg1){
        System.out.println("The Observer B receives the new data [" + ((MyObservable)arg0).getData() + "].");
    }
}
