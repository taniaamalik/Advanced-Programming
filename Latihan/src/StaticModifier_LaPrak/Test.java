package StaticModifier_LaPrak;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Akun nama = new Akun(); //static attribut milik bersama
        Akun nama1 = new Akun();
        nama.nim = 4321;//berubah jadi ini , kalo final eror
        Akun.test(); //method static bisa langsung dipanggil nama kelasnya, gausah di new dulu //static perlu saat gaberhubungan dengan object contoh ukuran mobil1+mobil2
        Scanner in = new Scanner(System.in);
        
        nama.nomor=2;
        nama1.nomor=3;
        System.out.println(nama.nomor);
        
        while(!nama.blokir){
            nama.login(in.nextInt());
            in.nextLine();
        }
    }
}
        class Akun{
            static int nomor;
            int nim =1234; //final gabisa diubah2
            boolean blokir=false;
            int counter =2;
            
            Akun(){
        nim=1234; //deklarasi final bisa tulis sendiri atau didalam constructor, contructor pertama kali dijalankan saat bikin object
    }
            
            public void login(int input){
                if(input==nim && !blokir){
                    System.out.println("Anda telah login");
                }else if(!blokir && counter!=0){
                    counter--;
                }else{
                    System.out.println("Anda telah diblokir");
                }
            }
            static void test(){
                System.out.println("ini method static");
            }
        }