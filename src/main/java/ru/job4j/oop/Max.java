package ru.job4j.oop;

public class Max {
    public int max(int left, int right) {
        return Math.max(left, right);
    }

    public int max(int front, int left, int right) {
        return Math.max(front, max(left, right));
    }

    public int max(int rear, int left, int right, int front) {
        return Math.max(rear, max(front, left, right));
    }
}