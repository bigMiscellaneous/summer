package com.training_daily.day02_code.wechatserver;

public interface Observerable {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();
}
