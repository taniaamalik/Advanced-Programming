package coba;

public class NewClass {
    public static void main(String[] args) {
        try{
            double p = getSquare(4);
            System.out.println("sukses");
        }catch(NullPointerException e){
            System.out.println("bilangan salah");
        }
    }
    public static double getSquare(int a){
        if(a<0){
            throw new ArithmeticException("Akar imajiner");
        }else{
            return Math.sqrt(a);
        }
    }
}