package quiz;

import java.util.Scanner;

public class PerusahaanATest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String id, pass, lembur;
        boolean log = false;
        int count = 0;
        PerusahaanA[] perusahaan = new PerusahaanA[4];
        perusahaan[0] = new PerusahaanA("Erlina", "30345678", "28", "Project Manajer", "123456", 12000000);
        perusahaan[1] = new PerusahaanA("Aci", "20567890", "27", "Designer", "789012", 8000000);
        perusahaan[2] = new PerusahaanA("Jeo", "18789012", "26", "Artist", "345678", 6000000);
        perusahaan[3] = new PerusahaanA("Alexa", "15901234", "30", "Programmer", "901234", 5000000);
        do {
            System.out.print("Masukkan ID Anda : ");
            id = in.nextLine();
            System.out.print("Masukkan Password Anda : ");
            pass = in.nextLine();
            for (int k = 0; k < perusahaan.length; k++) {
                if (id.equals(perusahaan[k].getID()) && pass.equals(perusahaan[k].getPass())) {
                    System.out.print("Waktu Lembur : ");
                    perusahaan[k].Bonus(in.nextInt());
                    perusahaan[k].displayMessage();
                    log = true;
                }
            }
            if (log == false) {
                System.out.println("-----------------------------------------------------");
                System.out.println("Maaf Data Yang Anda Masukkan Tidak Terdaftar");
                System.out.println("-----------------------------------------------------");
                count++;
            }
            if (count == 3) {
                for (int i = 0; i < perusahaan.length; i++) {
                        System.out.print("Jumlah Hari : ");
                        perusahaan[i].PenguranganGaji(in.nextInt());
                        if (id.equals(perusahaan[i].getID())){
                        perusahaan[i].displayMessage2();
                        log=true;
                        }
                    }
            }
        } while (log == false);
    }
}