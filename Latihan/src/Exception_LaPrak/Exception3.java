package Exception_LaPrak;

public class Exception3 {

    public static void main(String[] args) {
        int a, b, c;
        try { //mencoba program
            a = 1;
            b = 0;
            if (a == 1 && b == 0) {
                throw new ArithmeticException(); //anak error
            }
        } catch (RuntimeException x) { //ditangkap induk, kalau kebalikan gabisa
            System.out.println("program error");
        } finally { //selalu keluar dioutput
            System.out.println("program selesai");
        }
    }
}