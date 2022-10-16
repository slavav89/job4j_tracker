package ru.job4j.oop;

import static java.lang.Math.sqrt;
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public double semiPerimeter(double ab, double bc, double ac) {
        return (ab + bc + ac) / 2;
    }

    public boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && bc + ac > ab;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            rsl = sqrt(p*(p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }
}