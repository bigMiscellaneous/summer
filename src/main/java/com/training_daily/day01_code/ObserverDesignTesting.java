package com.training_daily.day01_code;
import java.util.Scanner;
public class ObserverDesignTesting {

    public static void main(String[] args) {
        MyObservable observer = new MyObservable();
        AObserver aObserver = new AObserver();
        BObserver bObserver = new BObserver();
        CObserver cObserver = new CObserver();
        observer.addObserver(aObserver);
        observer.addObserver(bObserver);
        observer.addObserver(cObserver);
        System.out.println("Please type your broadcast information：");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String msg = scanner.nextLine();
            if ("ok".equalsIgnoreCase(msg)) {
                System.err.println("See you!");
                break;
            } else if ("add a".equalsIgnoreCase(msg)) {
                observer.addObserver(aObserver);
            } else if ("add b".equalsIgnoreCase(msg)) {
                observer.addObserver(aObserver);
            } else if ("add c".equalsIgnoreCase(msg)) {
                observer.addObserver(aObserver);
            } else if ("del a".equalsIgnoreCase(msg)) {
                observer.deleteObserver(aObserver);
            } else if ("del b".equalsIgnoreCase(msg)) {
                observer.deleteObserver(aObserver);
            } else if ("del c".equalsIgnoreCase(msg)) {
                observer.deleteObserver(aObserver);
            }

            System.out.println("Currently, the Observer count is [" + observer.countObservers() + "]。");
            observer.setData(msg);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }

}
