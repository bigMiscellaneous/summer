package com.training_daily.day02_code.reflect;

public class Person {
    private String name;
    private String age;
    public String a;
    protected String b;
    String c;

    private String d;

    public Person() {

    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age='" + age + '\'' + ", a='" + a + '\'' + ", b='" + b + '\'' + ", c='" + c + '\'' + ", d='" + d + '\'' + '}';
    }
}