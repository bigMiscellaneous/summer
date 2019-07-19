package com.training_daily.day02_code.zoo;
import java.util.List;

public class ZooServer implements Zoo {
    private List<Animal> list;
    private String message;

    public void addAnimal(Animal animal) {
        list.add(animal);
    }

    public void subAnimal(Animal animal) {
        if (!list.isEmpty()) {
            list.remove(animal);
        }
    }

    public void notifyAnimal() {
        for (Animal animal : list) {
            Animal a = animal;
            a.update(message);
        }
    }

    public void sendInformation(String message) {
        this.message = message;
        System.out.println("动物园推送消息:" + message);
        notifyAnimal();
    }
}
