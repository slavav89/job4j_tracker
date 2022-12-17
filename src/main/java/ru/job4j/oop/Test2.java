package ru.job4j.oop;

public class Test2 extends Test1 {

    public static void test() {

        System.out.println("Static Hello from Test2");

    }

    @Override
    public void test1() {
        System.out.println("Hello from Test2");
    }

    public static void test4() {
        System.out.println("Hello34");
    }
}