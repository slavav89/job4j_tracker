package ru.job4j.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Generator gen = ArrayList::new;
        Object a = gen.createNewObject();
        System.out.println(a.getClass());
    }
}
