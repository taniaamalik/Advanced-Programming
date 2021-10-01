package quizpemlan;

public class KebunBinatang {

    private String hewan;
    private int Berat;
    private int Tinggi;
    private int Panjang;
    private int BMI;
    private String Makanan;
    private int JumlahH;
    
    private String Tanaman;
    private String Jenis;
    private int Umur;
    private int JumlahT;
    
    public KebunBinatang(String hwn, String mkn,int berat, int tinggi, int panjang, int jmlh){
        this.hewan= hwn;
        this.Makanan = mkn;
        this.Berat = berat;
        this.Tinggi = tinggi;
        this.Panjang = panjang;
        this.JumlahH = jmlh;
        getBMI();
    }
    
    
    public int getBMI(){
        this.BMI = Berat/(Panjang/Tinggi)*(Panjang/Tinggi);
        return BMI;
    }
    
    public void displayMessage1(){
        System.out.println("Hewan : " +hewan);
        System.out.println("Makanan : " +Makanan);
        System.out.println("BMI : " +BMI);
    }
    
    public KebunBinatang(String tanaman, String jenis, int umur, int jmlh){
        this.Tanaman = tanaman;
        this.Jenis = jenis;
        this.Umur = umur;
        this.JumlahT = jmlh;
    }
    
    public void displayMessage2(){
        System.out.println("Tanaman : " +Tanaman);
        System.out.println("Jenis : " +Jenis);
        System.out.println("Umur : " +Umur);
        System.out.println("Jumlah : " +JumlahT);
    }

}
