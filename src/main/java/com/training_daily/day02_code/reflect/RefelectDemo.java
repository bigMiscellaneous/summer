package com.training_daily.day02_code.reflect;
import java.lang.reflect.Field;
public class RefelectDemo {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("----------");
        Field a = personClass.getField("a");
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        a.set(p, "张三");
        System.out.println(p);
        Field[] declaredField = personClass.getDeclaredFields();
        for (Field field : declaredField) {
            System.out.println(field);
        }
        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);
        d.set(p, "李四");
        Object value2 = d.get(p);
        System.out.println(value2);
    }
}
