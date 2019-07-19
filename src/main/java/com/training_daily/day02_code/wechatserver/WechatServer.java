package com.training_daily.day02_code.wechatserver;
import java.util.List;
import java.util.ArrayList;
public class WechatServer implements Observerable {
    private List<Observer> list;
    private String message;

    public WechatServer() {
        list = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        list.add(o);
    }

    public void removeObserver(Observer o) {
        if (!list.isEmpty()) {
            list.remove(o);
        }
    }

    public void setInformation(String message) {
        this.message = message;
        System.out.println("微信服务更新消息：" + message);
        notifyObserver();
    }

    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(message);
        }
    }
}
