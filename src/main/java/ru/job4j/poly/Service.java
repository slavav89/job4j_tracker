package ru.job4j.poly;

import static java.lang.Character.isDigit;

public class Service {
    private String name;

    private String hello;

    public Service(String name) {
        this.hello = name;
    }

    public String getHello() {
        return hello;
    }

    public static void main(String[] args) {

        System.out.println((new Service("name").getHello() instanceof String));
        System.out.println(new Service("name").getHello());

    }
}