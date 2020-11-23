package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    // half of perimeter
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    // existing of triangle
    public boolean exist(double ab, double ac, double bc) {
        if (((ab + ac) > bc) && ((ac + bc) > ab) && ((bc + ac) > ab)) {
            return true;
        }
        return false;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = second.distance(third);
        double bc = third.distance(first);
        double p = period(ab, ac, bc);

        if (this.exist(ab, ac, bc)) {
            // write a equation for triangle area calculating
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }
}
