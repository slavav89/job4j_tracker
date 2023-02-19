package ru.job4j.poly;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.List.*;

import static java.util.stream.Nodes.collect;

public class Greeting {
    private String name;
    private int age;
    private String color;

    public Greeting(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
    }
}

