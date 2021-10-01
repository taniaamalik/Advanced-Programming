package BAB32;

public class lingkaran {

    int alas, tinggi;
    String Alas, Tinggi;

    public lingkaran(String alas, String tinggi){
        this.Alas = alas;
        this.Tinggi= tinggi;
    }
    
    public String getAlas(){
        return Alas;
    }
    
    public String getTinggi(){
        return Tinggi;
    }
    
    public int parseAlas(String alas){
        return Integer.parseInt(getAlas());
    }
    
    public int parseTinggi(String tinggi){
        return Integer.parseInt(getTinggi());
    }

    public lingkaran(int alas) {
        this.alas = alas;
    }

    public lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas1() {
        return alas;
    }

    public int getTinggi1() {
        return tinggi;
    }

    public double hitungLuas() {
        double hasil = (double) (getTinggi1() * getAlas1()) / 2;
        return hasil;
    }

    public void displayMessage() {
        System.out.println("Hitung Luas : " + hitungLuas());
    }
}