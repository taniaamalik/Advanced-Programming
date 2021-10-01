package BAB6;

public class TestCase {
    public static void main(String[] args) {
        Manusia[] m = new Manusia[3];
        m[0] = new Manusia("Dimas", "123", true, true); 
        m[1] = new Manusia("Rani", "456", false, true); 
        m[2] = new Manusia("Alex", "789", true, false);
        MahasiswaFILKOM[] mf = new MahasiswaFILKOM[3];
        mf[0] = new MahasiswaFILKOM("165150200111100", 2.8, "Dimas", "123", true, true); 
        mf[1] = new MahasiswaFILKOM("145150200111100", 3.2, "Rani", "456", false, true); 
        mf[2] = new MahasiswaFILKOM("135150200111100", 3.7, "Alex", "789", true, false);
        Pekerja[] p = new Pekerja[3];
        p[0] = new Pekerja(1000, 2016, 3, 2, 2, "Dimas", "123", true, true); 
        p[1] = new Pekerja(1000, 2009, 4, 5, 0, "Rani", "456", false, true); 
        p[2] = new Pekerja(1000, 1998, 6, 7, 10, "Alex", "789", true, false); 
        Manager manager = new Manager("HRD", 7500, 2003, 4, 3, 0, "Ebi", "101", false, false);
        System.out.println(m[0]); 
        System.out.println("-------------------------------------------");
        System.out.println(m[1]); 
        System.out.println("-------------------------------------------");
        System.out.println(m[2]);
        System.out.println("-------------------------------------------");
        System.out.println(mf[0]);
        System.out.println("-------------------------------------------");
        System.out.println(mf[1]);
        System.out.println("-------------------------------------------");
        System.out.println(mf[2]);
        System.out.println("-------------------------------------------");
        System.out.println(p[0]);
        System.out.println("-------------------------------------------");
        System.out.println(p[1]);
        System.out.println("-------------------------------------------");
        System.out.println(p[2]);
        System.out.println("-------------------------------------------");
        System.out.println(manager);
        System.out.println("-------------------------------------------");
    }
}