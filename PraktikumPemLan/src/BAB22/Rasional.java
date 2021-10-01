package BAB22;

public class Rasional {

    private int pembilang, penyebut,hasil;

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }

    //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional() {
        return (penyebut != 0);
    }
    
    //menyederhanakan bilangan rasional
    public void Sederhana() {
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;
        
        while (B != 0) {
            temp = A % B;
            A = B;
            B = temp;
        }
        pembilang /= A;
        penyebut /= A;
    }

    public double Cast() {
        return (penyebut == 0.0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    //oprator >
        public boolean lessThan(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }
        
            public boolean lessThanEquals(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }
    
        public boolean moreThanEquals(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }
        
    public boolean moreThan(Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }
    
    //operator Unary- ---> A = -A
    public void negasi() {
        pembilang = -pembilang;
    }
    
    //operator unary += \  
    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
    
    public void unaryMinus(Rasional A){
       pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
       penyebut *= A.penyebut; 
    }
    
    public void unaryMultiple(Rasional A){
       pembilang *= A.pembilang;
       penyebut *= A.penyebut; 
    }
    
        public void unaryDivide(Rasional A){
       pembilang *= A.penyebut;
       penyebut *= A.pembilang; 
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}