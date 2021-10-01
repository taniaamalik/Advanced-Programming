package Exception_LaPrak;

public class Exception {

    public static void main(String[] args) {
        int a, b, c;
        try {
            a = 1;
            b = 0;
            c = a / b; //yg keluar yg pertama kali error
            int[] z = new int[2];
            System.out.println(z[3]);
        } catch (ArithmeticException x) {
            System.out.println("jangan masukin 1 dibagi 0. Nanti undefined");
        } /*try{
            int[] z = new int[2];
            System.out.println(z[3]);
    }*/ catch (ArrayIndexOutOfBoundsException y) {
            System.out.println("array yang anda tunjuk tidak ada");
        }
    }
}