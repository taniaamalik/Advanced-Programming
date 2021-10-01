package Exception_LaPrak;

public class Exception2 {
    
    public static void main(String[] args) {
        int a, b, c;
        try { //mencoba program
            a = 1;
            b = 0;
            if (a == 1 && b == 0) {
                throw new ArithmeticException(); //melempar error
            }
            //c=a/b;
        } catch (ArithmeticException x) { //menangkap error
            System.out.println("jangan masukin 1 dibagi 0. Nanti undefined");
        } finally { //selalli keluar dioutput
            System.out.println("program selesai");
        }
    }
}