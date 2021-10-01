package Tugas4;

public class Test {

    public static void main(String[] args) {
        Circle ci1 = new Circle();
        System.out.println("CIRCLE =");
        System.out.println(ci1);
        System.out.println("-----------------------------------");
        Circle ci2 = new Circle(11.5);
        System.out.println("CIRCLE =");
        System.out.println(ci2);
        System.out.println("-----------------------------------");
        Cylinder cy1 = new Cylinder();
        System.out.println("CYLINDER =");
        System.out.println("height : " + cy1.getHeight());
        System.out.println(cy1);
        System.out.println("Volume : " + cy1.getVolume());
        System.out.println("-----------------------------------");
        Cylinder cy2 = new Cylinder(5);
        System.out.println("CYLINDER =");
        System.out.println("height : " + cy2.getHeight());
        System.out.println(cy2);
        System.out.println("Volume : " + cy2.getVolume());
        System.out.println("-----------------------------------");
        Cylinder cy3 = new Cylinder(6, 3.9);
        System.out.println("CYLINDER =");
        System.out.println("height : " + cy3.getHeight());
        System.out.println(cy3);
        System.out.println("Volume : " + cy3.getVolume());
        System.out.println("-----------------------------------");
    }
}