package com.training_daily.day02_code.wechatserver;

public class Test {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();
        Observer userOne = new User("张三");
        Observer userTwo = new User("李四");
        Observer userThree = new User("王五");
        server.registerObserver(userOne);
        server.registerObserver(userTwo);
        server.registerObserver(userThree);
        server.setInformation("我爱java");
        System.out.println("--------------------------------------------");
        server.removeObserver(userOne);
        server.setInformation("java是世界上最好的语言");
    }
}
