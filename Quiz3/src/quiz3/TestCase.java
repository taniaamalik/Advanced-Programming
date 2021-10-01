package quiz3;

public class TestCase {

    public static void main(String[] args) {
        Karyawan[] k = new Karyawan[4];
        k[0] = new Karyawan("Ainat", "22-02-1998", "01-01-2012", 4500000);
        k[1] = new Manajer("Inata", "10-10-1997", "31-01-2013", 5000000);
        k[2] = new Desainer("Niana", "10-05-1994", "12-10-2010", 7500000);
        k[3] = new Engineer("Tania", "15-12-1999", "05-03-2014", 9000000);
        System.out.println("==============KARYAWAN==============");
        System.out.println(k[0]);
        System.out.println("==============MANAJER==============");
        System.out.println(k[1]);
        System.out.println("==============DESAINER==============");
        System.out.println(k[2]);
        System.out.println("==============ENGINEER==============");
        System.out.println(k[3]);
    }
}