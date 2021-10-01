package Tugas2;

import java.util.Scanner;

public class MhsTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Mhs mhs1 = new Mhs();
        System.out.print("Masukkan Nama Mahasiswa 1 : ");
        mhs1.setNama(in.nextLine());
        System.out.print("Masukkan NIM Mahasiswa 1 : ");
        mhs1.setNIM(in.nextLine());
        System.out.print("Masukkan Nilai Tugas Mahasiswa 1 : ");
        mhs1.setnilaiTugas(in.nextDouble());
        System.out.print("Masukkan Nilai Quiz Mahasiswa 1 : ");
        mhs1.setnilaiQuiz(in.nextDouble());
        System.out.print("Masukkan Nilai UTS Mahasiswa 1 : ");
        mhs1.setnilaiUTS(in.nextDouble());
        System.out.print("Masukkan Nilai UAS Mahasiswa 1 : ");
        mhs1.setnilaiUAS(in.nextDouble());

        Mhs mhs2 = new Mhs();
        in.nextLine();
        System.out.print("Masukkan Nama Mahasiswa 2 : ");
        mhs2.setNama(in.nextLine());
        System.out.print("Masukkan NIM Mahasiswa 2 : ");
        mhs2.setNIM(in.nextLine());
        System.out.print("Masukkan Nilai Tugas Mahasiswa 2 : ");
        mhs2.setnilaiTugas(in.nextDouble());
        System.out.print("Masukkan Nilai Quiz Mahasiswa 2 : ");
        mhs2.setnilaiQuiz(in.nextDouble());
        System.out.print("Masukkan Nilai UTS Mahasiswa 2 : ");
        mhs2.setnilaiUTS(in.nextDouble());
        System.out.print("Masukkan Nilai UAS Mahasiswa 2 : ");
        mhs2.setnilaiUAS(in.nextDouble());

        Mhs mhs3 = new Mhs();
        in.nextLine();
        System.out.print("Masukkan Nama Mahasiswa 3 : ");
        mhs3.setNama(in.nextLine());
        System.out.print("Masukkan NIM Mahasiswa 3 : ");
        mhs3.setNIM(in.nextLine());
        System.out.print("Masukkan Nilai Tugas Mahasiswa 3 : ");
        mhs3.setnilaiTugas(in.nextDouble());
        System.out.print("Masukkan Nilai Quiz Mahasiswa 3 : ");
        mhs3.setnilaiQuiz(in.nextDouble());
        System.out.print("Masukkan Nilai UTS Mahasiswa 3 : ");
        mhs3.setnilaiUTS(in.nextDouble());
        System.out.print("Masukkan Nilai UAS Mahasiswa 3 : ");
        mhs3.setnilaiUAS(in.nextDouble());

        System.out.println("==================================");
        System.out.println("Nama Mahasiswa 1 : " + mhs1.getNama());
        System.out.println("NIM Mahasiswa 1 : " + mhs1.getNIM());
        System.out.println("Nilai Tugas Mahasiswa 1 : " + mhs1.getnilaiTugas());
        System.out.println("Nilai Quiz Mahasiswa 1 : " + mhs1.getnilaiQuiz());
        System.out.println("Nilai UTS Mahasiswa 1 : " + mhs1.getnilaiUTS());
        System.out.println("Nilai UAS Mahasiswa 1 : " + mhs1.getnilaiUAS());
        System.out.printf("%s%.2f\n", "Nilai Akhir Mahasiswa 1 : ", mhs1.getnilaiAkhir());

        System.out.println("==================================");
        System.out.println("Nama Mahasiswa 2 : " + mhs2.getNama());
        System.out.println("NIM Mahasiswa 2 : " + mhs2.getNIM());
        System.out.println("Nilai Tugas Mahasiswa 2 : " + mhs2.getnilaiTugas());
        System.out.println("Nilai Quiz Mahasiswa 2 : " + mhs2.getnilaiQuiz());
        System.out.println("Nilai UTS Mahasiswa 2 : " + mhs2.getnilaiUTS());
        System.out.println("Nilai UAS Mahasiswa 2 : " + mhs2.getnilaiUAS());
        System.out.printf("%s%.2f\n", "Nilai Akhir Mahasiswa 2 : ", mhs2.getnilaiAkhir());

        System.out.println("==================================");
        System.out.println("Nama Mahasiswa 3 : " + mhs3.getNama());
        System.out.println("NIM Mahasiswa 3 : " + mhs3.getNIM());
        System.out.println("Nilai Tugas Mahasiswa 3 : " + mhs3.getnilaiTugas());
        System.out.println("Nilai Quiz Mahasiswa 3 : " + mhs3.getnilaiQuiz());
        System.out.println("Nilai UTS Mahasiswa 3 : " + mhs3.getnilaiUTS());
        System.out.println("Nilai UAS Mahasiswa 3 : " + mhs3.getnilaiUAS());
        System.out.printf("%s%.2f\n", "Nilai Akhir Mahasiswa 3 : ", mhs3.getnilaiAkhir());

        Mhs nilaiRata2 = new Mhs();
        System.out.println("==================================");
        System.out.printf("%s%.2f\n", "Nilai Rata2 Mahasiswa 1&2&3 : ", nilaiRata2.getnilaiRata2(mhs1.getnilaiAkhir(), mhs2.getnilaiAkhir(), mhs3.getnilaiAkhir()));
    }
}