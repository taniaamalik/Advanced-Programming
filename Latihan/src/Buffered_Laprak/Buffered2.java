package Buffered_Laprak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Buffered2 {
    public static void main(String[] args) throws IOException { //scanner string diinput duluan, kalau buffered reader data yg diinput mentah jd cuma bisa read line, data nya langsung string
    Scanner in = new Scanner(System.in);
//writer = dari netbeans ke notepad
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Buffered2.txt"), "utf-8"))) {
                String output = "output";
                writer.write(output);
            }
  //atau      
        BufferedWriter writer1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Buffered2.txt"), "utf-8"));
        String out = in.nextLine();
        writer1.write(out); //write sudah dideklarasi dinetbeans tinggal dipanggil
        writer1.close(); //harus diclose
  //atau
        BufferedWriter x = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Buffered2.txt"), "utf-8")); //namafile bisa diganti sesuai nama notepad
        String LineIni1 = in.nextLine(); //bacanya perline gabisa baca lebih dr satu line
        x.close();
        System.out.println(LineIni1);
  //atau
  BufferedWriter y = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Buffered2.txt"), "utf-8")); //namafile bisa diganti sesuai nama notepad
        String LineIni2 = in.nextLine();
        y.close();
        
        while(LineIni2!=null){ //membaca lebih dari satu baris
            System.out.println(LineIni2);
           // LineIni2 = in.readLine();
        }
        y.close();

  //reader = dari notepad ke netbeans
        BufferedReader br = new BufferedReader(new FileReader("D:\\Buffered2.txt"));
        String lineIni = br.readLine();
        br.close();
        System.out.println(lineIni);
    }
}
