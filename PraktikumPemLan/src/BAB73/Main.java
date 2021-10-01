package BAB73;

public class Main {

    public static void main(String[] args) {
        Employee a = new SalaryBasedOnProduct("ais", "123", 50000, 50);
        System.out.println(a.toString());
        System.out.println("Total Upah : " + a.earnings());
        System.out.println("-----------------------------------------");
        Employee b = new SalaryBasedOnProduct("bella", "456", 100000, 20);
        System.out.println(b.toString());
        System.out.println("Total Upah : " + b.earnings());
        System.out.println("-----------------------------------------");
        Employee c = new SalaryBasedOnProduct("clark", "789", 150000, 25);
        System.out.println(c.toString());
        System.out.println("Total Upah : " + c.earnings());
        System.out.println("-----------------------------------------");
        Employee d = new SalaryBasedOnProduct("dodi", "012", 200000, 33);
        System.out.println(d.toString());
        System.out.println("Total Upah : " + d.earnings());
        System.out.println("-----------------------------------------");
    }
}