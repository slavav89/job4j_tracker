package ru.job4j.oop;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void whenThis57That12Then6dot403() {
        Point a = new Point(5, 7);
        Point b = new Point(1, 2);
        double dist = a.distance(b);
        double expected = 6.403;
        assertThat(dist).isCloseTo(expected, Percentage.withPercentage(0.01));
    }

    @Test
    public void whenThis00That02Then2Dot0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double expected = 2.0;
        assertThat(dist).isCloseTo(expected, Percentage.withPercentage(0.01));
    }

    @Test
    public void whenThis02That04Then2Dot0() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 4);
        double dist = a.distance(b);
        double expected = 2.0;
        assertThat(dist).isCloseTo(expected, Percentage.withPercentage(0.01));
    }

    @Test
    public void whenThis102That903Then80dot006() {
        Point a = new Point(10, 2);
        Point b = new Point(90, 3);
        double dist = a.distance(b);
        double expected = 80.006;
        assertThat(dist).isCloseTo(expected, Percentage.withPercentage(0.01));
    }
}