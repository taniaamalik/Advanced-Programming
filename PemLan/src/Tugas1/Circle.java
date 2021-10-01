package Tugas1;

public class Circle {

    double r, luas, keliling;
    final double phi = 3.14;

    public void setRadius(double radius) {
        r = radius;
    }

    public double getArea() {
        luas = phi * r * r;
        return luas;
    }

    public double getPerimeter() {
        keliling = 2 * phi * r;
        return keliling;
    }
}