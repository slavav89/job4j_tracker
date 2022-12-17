package ru.job4j.oop;

public class Test3 {
    public static void main(String[] args) {

        Test1 test1 = new Test1();
        Test1 test2 = new Test2();
        Test2 test2a = new Test2();
        test1.test();
        test2.test();
        test2a.test();
        System.out.println("\n");
        test1.test1();
        test2.test1();
        test2a.test1();
        System.out.println("\n");
        Test1.test();
        Test2.test();
        System.out.println("\n");
        test2.test3();
        test2a.test4();
        test2a.test3();
        test2a.test4();
    }
}
