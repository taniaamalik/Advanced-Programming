package BAB12;

public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double rubahSekon;
    private double detik;
    private double rubahKecepatan;
    private double mPs;
    private double jarak;
    private double kilo;

    public double hitungJarak() {
        jarak = mPs * detik;
        kilo = jarak / 1000;
        return jarak;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek  " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan  " + kecepatan + " km/h");
        System.out.printf("%s%.2f%s\n", "atau jika diubah kecepatannya menjadi ", mPs, " m/s");
        System.out.println("dengan waktu " + waktu + " jam");
        System.out.printf("%s%.2f%s\n", "atau ", detik, " detik");
        System.out.printf("%s%.2f%s\n", "jarak yang dapat ditempuh adalah ", jarak, " m");
        System.out.printf("%s%.2f%s\n", "atau jika diubah jaraknya menjadi ", kilo, " km");
    }

    public double rubahKecepatan(double k) {
        rubahKecepatan = k;
        mPs = (double) (rubahKecepatan * 1000) / 3600;
        return mPs;
    }

    public double rubahSekon(double s) {
        rubahSekon = s;
        detik = rubahSekon * 3600;
        return detik;
    }

    public void setKecepatan(int i) {
        kecepatan = i;
        rubahKecepatan(kecepatan);
    }

    public void setWaktu(double x) {
        waktu = x;
        rubahSekon(waktu);
    }

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

}