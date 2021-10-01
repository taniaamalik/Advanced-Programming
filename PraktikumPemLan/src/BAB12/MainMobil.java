package BAB12;

import java.util.Scanner;

public class MainMobil {

    public static void main(String[] args) {
//instan objek bernama m1  
        Scanner in = new Scanner(System.in);
        Mobil m1 = new Mobil();
        System.out.print("Masukkan Waktu(jam) : ");
        m1.setWaktu(in.nextInt());
        System.out.print("Masukkan Kecepatan : ");
        m1.setKecepatan(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan Manufaktur : ");
        m1.setManufaktur(in.nextLine());
        System.out.print("Masukkan Nomor Plat : ");
        m1.setNoPlat(in.nextLine());
        System.out.print("Masukkan Warna : ");
        m1.setWarna(in.nextLine());
        m1.hitungJarak();
        m1.displayMessage();
        System.out.println("================");
//instan objek baru bernama m2
        Mobil m2 = new Mobil();
        System.out.print("Masukkan Kecepatan : ");
        m2.setKecepatan(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan Manufaktur : ");
        m2.setManufaktur(in.nextLine());
        System.out.print("Masukkan Nomor Plat : ");
        m2.setNoPlat(in.nextLine());
        System.out.print("Masukkan Warna : ");
        m2.setWarna(in.nextLine());
        m2.displayMessage();
        System.out.println("================");
//merubah warna dari objek m1  
        System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
        m1.setWarna("Hijau");
//menampilkan hasil perubahan
        m1.displayMessage();
    }
}