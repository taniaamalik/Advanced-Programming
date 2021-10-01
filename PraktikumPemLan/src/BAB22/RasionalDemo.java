package BAB22;

public class RasionalDemo {

    public static void main(String[] args) {
        Rasional R1 = new Rasional(1, 2);
        Rasional R2 = new Rasional(1, 3);
        System.out.println();
        System.out.println("R1.isRasional: " + R1.isRasional());
        System.out.println("R2.isRasional: " + R1.isRasional());
        System.out.println();
        System.out.println("R1 > R2 : " + R1.moreThan(R2));
        System.out.println("R1 < R2 : " + R1.lessThan(R2));
        System.out.println("R1 <= R2 : " + R1.lessThanEquals(R2));
        System.out.println("R1 >= R2 : " + R1.moreThanEquals(R2));
        System.out.println();
        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();
        R1.Sederhana();
        R2.Sederhana();
        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();
        System.out.println("Setelah  dilakukan  Cast  ke  double menjadi : ");
        System.out.println("R1 : " + R1.Cast());
        System.out.println("R2 : " + R2.Cast());
        System.out.println();
//        R1.negasi();
//        System.out.print("Unary- dari R1 : ");
//        R1.cetak();
//        System.out.println();
        R1.unaryPlus(R2);
        System.out.print("Nilai dari 'R1 += R2' : ");
        R1.cetak();
        System.out.println();
        
        Rasional R3 = new Rasional(1, 2);
        Rasional R4 = new Rasional(1, 3);
        R3.unaryMinus(R4);
        System.out.print("Nilai dari 'R1 -= R2' : ");
        R3.cetak();
        System.out.println();
        Rasional R5 = new Rasional(1, 2);
        Rasional R6 = new Rasional(1, 3);
        R5.unaryMultiple(R6);
        System.out.print("Nilai dari 'R1 *= R2' : ");
        R5.cetak();
        System.out.println();
        Rasional R7 = new Rasional(1, 2);
        Rasional R8 = new Rasional(1, 3);
        R7.unaryDivide(R8);
        System.out.print("Nilai dari 'R1 /= R2' : ");
        R7.cetak();
        
    }
}