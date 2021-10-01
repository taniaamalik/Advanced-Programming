package Buffered_Laprak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Buffered {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
                "D:\\coba.txt"), "utf-8"))) {
            writer.write(input);
        }

        String data;
        try (BufferedReader br = new BufferedReader(
                new FileReader("D:\\Biodata.txt"))) {
            data = br.readLine();
        }

        String[] array = data.split("; ");
        String NIM = array[0];
        String NAMA = array[1];
        String JURUSAN = array[2];
        String ASAL = array[3];

        System.out.println("NIM     : " + NIM);
        System.out.println("Nama    : " + NAMA);
        System.out.println("Jurusan : " + JURUSAN);
        System.out.println("Asal    : " + ASAL);
        
        Scanner sc = new Scanner(data);
        sc.useDelimiter("; ");
        String nim = sc.next();
        String nama = sc.next();
        String jurusan = sc.next();
        String asal = sc.next();

        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Asal    : " + asal);
        
        
    }
}