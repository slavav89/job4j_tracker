package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int front, int left, int right) {
        return Math.max(front, max(left, right));
    }

    public static int max(int rear, int left, int right, int front) {
        return Math.max(rear, max(front, left, right));
    }
}