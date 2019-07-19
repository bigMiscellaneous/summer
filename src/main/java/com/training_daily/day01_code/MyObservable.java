package com.training_daily.day01_code;
import java.util.Observable;
public class MyObservable extends Observable {
    private String data = "";
    public String getData(){
        return data;
    }
    public void setData(String data){
        if(data != null && !data.equals(this.data)){
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }
}
