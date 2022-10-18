package ru.job4j.oop;

import static java.lang.Math.max;
public class Max {
    public int maxs(int left, int right) {
        return max(left, right);
    }

    public int maxs(int front, int left, int right) {
        return max(front, maxs(left, right));
    }

    public int maxs(int rear, int left, int right, int front) {
        return max(rear, maxs(front, left, right));
    }
}