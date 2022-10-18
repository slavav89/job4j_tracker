package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.offset;

public class PointTest {

    @Test
    public void whenThis57That12Then6dot403() {
        Point a = new Point(5, 7);
        Point b = new Point(1, 2);
        double dist = a.distance(b);
        double expected = 6.403;
        assertThat(dist).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void whenThis00That02Then2Dot0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double expected = 2.0;
        assertThat(dist).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void whenThis02That04Then2Dot0() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 4);
        double dist = a.distance(b);
        double expected = 2.0;
        assertThat(dist).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void whenThis102That903Then80dot006() {
        Point a = new Point(10, 2);
        Point b = new Point(90, 3);
        double dist = a.distance(b);
        double expected = 80.006;
        assertThat(dist).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void whenThis789That123Then10dot392() {
        Point a = new Point(7, 8, 9);
        Point b = new Point(1, 2, 3);
        double dist = a.distance3d(b);
        double expected = 10.392;
        assertThat(dist).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void whenThis073That294Then3dot0() {
        Point a = new Point(0, 7, 3);
        Point b = new Point(2, 9, 4);
        double dist = a.distance3d(b);
        double expected = 3.0;
        assertThat(dist).isCloseTo(expected, offset(0.001));
    }
}