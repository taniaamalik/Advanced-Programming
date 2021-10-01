package BAB22;

import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) {
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();
        anna.jumlahObjek();
        //menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();
        anna.jumlahObjek();
        
        System.out.println("==================");
        Student tania = new Student(100,90,80);
        tania.setName("Tania");
        tania.setAddress("Malang");
        tania.setAge(18);
        tania.displayMessage();
        anna.jumlahObjek();
        
        System.out.println("==================");
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah Siswa : ");
        int jmlh = in.nextInt();
        Student[] siswa = new Student[jmlh];
        for (int i = 0; i < siswa.length; i++) {
            siswa[i] = new Student();
            in.nextLine();
            System.out.print("Nama Siswa ke-" + (i+1) + ": ");
            siswa[i].setName(in.nextLine());
            System.out.print("Alamat Siswa ke-" + (i+1) + ": ");
            siswa[i].setAddress(in.nextLine());
            System.out.print("Umur Siswa ke-" + (i+1) + ": ");
            siswa[i].setAge(in.nextInt());
            System.out.print("Masukan Nilai Matematika Siswa ke-" + (i+1) + ": ");
            siswa[i].setMath(in.nextInt());
            System.out.print("Masukan Nilai Inggris Siswa ke-" + (i+1) + ": ");
            siswa[i].setEnglish(in.nextInt());
            System.out.print("Masukan Nilai Sains Siswa ke-" + (i+1) + ": ");
            siswa[i].setScience(in.nextInt());
            siswa[i].displayMessage();
            anna.jumlahObjek();
            System.out.println("==================================================================");
        }
    }     
} 