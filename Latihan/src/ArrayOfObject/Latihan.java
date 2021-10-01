package ArrayOfObject;

public class Latihan {
    
    public static void main(String[] args) {
        Mobil[] m = new Mobil[10];
        m[0]=new Mobil();
        m[1]=new Mobil();
        m[2]=new Mobil();
        
        for (int i = 0; i < 10; i++) {
            m[i] = new Mobil();
        }
    }
}