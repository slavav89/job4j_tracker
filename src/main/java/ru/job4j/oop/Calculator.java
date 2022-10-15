package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int r) {
        return r / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + multiply(d) + minus(d) + divide(d);
    }

    public static void main(String[] args) {
        int rslSum = sum(10);
        System.out.println(rslSum);
        int rslMinus = minus(15);
        System.out.println(rslMinus);
        Calculator calculator = new Calculator();
        int rslMultiply = calculator.multiply(5);
        System.out.println(rslMultiply);
        int rslDivide = calculator.divide(20);
        System.out.println(rslDivide);
        int rslAllSum = calculator.sumAllOperation(5);
        System.out.println(rslAllSum);
    }
}

