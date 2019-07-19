package com.training_daily.day02_code.zoo;

public class Looker implements Animal {
    private String name;
    private String message;

    public Looker(String name) {
        this.name = name;
    }

    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + "收到消息" + message);
    }
}
