package BAB72;

public class Main {
    
    public static void main(String[] args) {
        Employee a2 = new SalariedEmployee("ais", "123", 1, 2, 1996, 100000);
        System.out.println(a2);
        System.out.println("Salary        : " + a2.earnings());
        System.out.println("-----------------------------------");
        Employee a1 = new SalariedEmployee("ais", "123", 1, 5, 1996, 100000);
        System.out.println(a1);
        System.out.println("Salary(bonus 100000) : " + a1.earnings());
        System.out.println();
        Employee b2 = new HourlyEmployee("bella", "456", 30, 4, 1993, 200000, 40);
        System.out.println(b2);
        System.out.println("Salary        : " + b2.earnings());
        System.out.println("-----------------------------------");
        Employee b1 = new HourlyEmployee("bella", "456", 30, 5, 1993, 200000, 40);
        System.out.println(b1);
        System.out.println("Salary(bonus 100000) : " + b1.earnings());
        System.out.println();
        Employee c2 = new CommissionEmployee("clark", "789", 4, 2, 1991, 20000, 80);
        System.out.println(c2);
        System.out.println("Salary        : " + c2.earnings());
        System.out.println("-----------------------------------");
        Employee c1 = new CommissionEmployee("clark", "789", 3, 5, 1991, 20000, 80);
        System.out.println(c1);
        System.out.println("Salary(bonus 100000) : " + c1.earnings());
        System.out.println();
        Employee d2 = new BasePlusCommissionEmployee("dodi", "012", 100, 85, 15, 12, 1989, 1000000);
        System.out.println(d2);
        System.out.println("Salary        : " + d2.earnings());
        System.out.println("-----------------------------------");
        Employee d1 = new BasePlusCommissionEmployee("dodi", "012", 100, 85, 11, 5, 1989, 1000000);
        System.out.println(d1);
        System.out.println("Salary(bonus 100000) : " + d1.earnings());
    }
}