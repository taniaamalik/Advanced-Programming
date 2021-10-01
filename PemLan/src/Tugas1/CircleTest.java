package Tugas1;

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("Masukkan Radius : ");
        c.setRadius(in.nextDouble());
        System.out.println("============================");
        System.out.printf("%s%.2f\n", "Luas Lingkaran : ", c.getArea());
        System.out.printf("%s%.2f\n", "Keliling Lingkaran : ", c.getPerimeter());
    }
}