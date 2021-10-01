package Polymorphism;

public class Test {

    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Circle(15, "blue", true);
        s[1] = new Rectangle(2, 3, "blue", true);
        s[2] = new Square(3, "blue", true);
        for (int i = 0; i < s.length ; i++) {
            System.out.println(s[i]);
        System.out.println("-------------------------");
        }
    }
}