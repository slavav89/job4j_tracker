package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void when1and2and3and4Then4() {
        int left = 1;
        int right = 2;
        int front = 3;
        int rear = 4;
        int expected = 4;
        int rsl = Max.max(rear, left, right, front);
        assertThat(rsl).isEqualTo(expected);

    }

    @Test
    public void whenMinus1and9and0and7Then9() {
        int left = -1;
        int right = 9;
        int front = 0;
        int rear = 9;
        int expected = 9;
        int rsl = Max.max(rear, left, right, front);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void when0and0and0and0Then0() {
        int left = 0;
        int right = 0;
        int front = 0;
        int rear = 0;
        int expected = 0;
        int rsl = Max.max(rear, left, right, front);
        assertThat(rsl).isEqualTo(expected);
    }
}