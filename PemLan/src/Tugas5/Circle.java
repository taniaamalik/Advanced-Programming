package Tugas5;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    public String toString() {
        return super.toString() + "\n" + "radius : " + radius + "\n" + "luas     : " +getArea() + "\n" + "Keliling : " +getPerimeter() +"\n" +"-----------------------------------";
    }
}