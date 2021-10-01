package Tugas3;

import java.util.Scanner;

public class RentalTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rental r1 = new Rental();
        System.out.print("Masukkan Nama Pelanggan 1 : ");
        r1.setNama(in.nextLine());
        System.out.print("Masukkan No Identitas Pelanggan 1 : ");
        r1.setno_Identitas(in.nextLine());
        System.out.println("Kategori CD = ");
        System.out.println("1. Film");
        System.out.println("2. Musik");
        System.out.println("3. Edukasi");
        System.out.print("Masukkan Kategori CD yang Dipilih Pelanggan 1 : ");
        r1.setkategori_CD(in.nextInt());
        System.out.print("Masukkan Tanggal Peminjaman Pelanggan 1 : ");
        r1.settgl_pinjam(in.nextInt());
        System.out.print("Masukkan Tanggal Pengembalian Pelanggan 1 : ");
        r1.settgl_kembali(in.nextInt());

        Rental r2 = new Rental();
        in.nextLine();
        System.out.print("Masukkan Nama Pelanggan 2 : ");
        r2.setNama(in.nextLine());
        System.out.print("Masukkan No Identitas Pelanggan 2 : ");
        r2.setno_Identitas(in.nextLine());
        System.out.println("Kategori CD = ");
        System.out.println("1. Film");
        System.out.println("2. Musik");
        System.out.println("3. Edukasi");
        System.out.print("Masukkan Kategori CD yang Dipilih Pelanggan 2 : ");
        r2.setkategori_CD(in.nextInt());
        System.out.print("Masukkan Tanggal Peminjaman Pelanggan 2 : ");
        r2.settgl_pinjam(in.nextInt());
        System.out.print("Masukkan Tanggal Pengembalian Pelanggan 2 : ");
        r2.settgl_kembali(in.nextInt());

        Rental r3 = new Rental();
        in.nextLine();
        System.out.print("Masukkan Nama Pelanggan 3 : ");
        r3.setNama(in.nextLine());
        System.out.print("Masukkan No Identitas Pelanggan 3 : ");
        r3.setno_Identitas(in.nextLine());
        System.out.println("Kategori CD = ");
        System.out.println("1. Film");
        System.out.println("2. Musik");
        System.out.println("3. Edukasi");
        System.out.print("Masukkan Kategori CD yang Dipilih Pelanggan 3 : ");
        r3.setkategori_CD(in.nextInt());
        System.out.print("Masukkan Tanggal Peminjaman Pelanggan 3 : ");
        r3.settgl_pinjam(in.nextInt());
        System.out.print("Masukkan Tanggal Pengembalian Pelanggan 3 : ");
        r3.settgl_kembali(in.nextInt());

        System.out.println("===============================================");
        System.out.println("Nama Pelanggan 1 : " + r1.getNama());
        System.out.println("No Identitas Pelanggan 1 : " + r1.getno_identitas());
        System.out.println("Kategori CD yang Dipilih Pelanggan 1 : " + r1.getkategori_CD());
        System.out.println("Tanggal Peminjaman Pelanggan 1 : " + r1.gettgl_pinjam());
        System.out.println("Tanggal Pengembalian Pelanggan 1 : " + r1.gettgl_kembali());
        System.out.println("Lama Peminjaman Pelanggan 1 : " + r1.getlama_peminjaman(r1.gettgl_kembali(), r1.gettgl_pinjam()) + " hari");
        System.out.println("Total Denda Pelanggan 1 : " + r1.gettotal());

        System.out.println("===============================================");
        System.out.println("Nama Pelanggan 2 : " + r2.getNama());
        System.out.println("No Identitas Pelanggan 2 : " + r2.getno_identitas());
        System.out.println("Kategori CD yang Dipilih Pelanggan 2 : " + r2.getkategori_CD());
        System.out.println("Tanggal Peminjaman Pelanggan 2 : " + r2.gettgl_pinjam());
        System.out.println("Tanggal Pengembalian Pelanggan 2 : " + r2.gettgl_kembali());
        System.out.println("Lama Peminjaman Pelanggan 2 : " + r2.getlama_peminjaman(r2.gettgl_kembali(), r2.gettgl_pinjam()) + " hari");
        System.out.println("Total Denda Pelanggan 2 : " + r2.gettotal());

        System.out.println("===============================================");
        System.out.println("Nama Pelanggan 3 : " + r3.getNama());
        System.out.println("No Identitas Pelanggan 3 : " + r3.getno_identitas());
        System.out.println("Kategori CD yang Dipilih Pelanggan 3 : " + r3.getkategori_CD());
        System.out.println("Tanggal Peminjaman Pelanggan 3 : " + r3.gettgl_pinjam());
        System.out.println("Tanggal Pengembalian Pelanggan 3 : " + r3.gettgl_kembali());
        System.out.println("Lama Peminjaman Pelanggan 3 : " + r3.getlama_peminjaman(r3.gettgl_kembali(), r3.gettgl_pinjam()) + " hari");
        System.out.println("Total Denda Pelanggan 3 : " + r3.gettotal());
    }
}