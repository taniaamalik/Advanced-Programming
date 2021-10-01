package Test;

import java.util.*;
import Kuliah.*;
import Mahasiswa.*;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pilihan;
		ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();
		ArrayList<MataKuliah> mk = new ArrayList<MataKuliah>();
		ArrayList<Ruang> ruang = new ArrayList<Ruang>();

		do {
			System.out.println("===Selamat Datang di Aplikasi Perkuliahan===");
			System.out.println("Pilih menu: ");
			System.out.println("1. Input Mahasiswa");
			System.out.println("2. Input Mata Kuliah");
			System.out.println("3. Input Ruang");
			System.out.println("4. Tampilkan Data Mahasiswa");
			System.out.println("5. Tampilkan Data Mata Kuliah");
			System.out.println("6. Tampilkan Data Ruang");
			System.out.println("0. Exit");
			System.out.println("==============================");
			System.out.print("Masukkan pilihan anda: ");
			pilihan = in.nextInt();
			in.nextLine();
			System.out.println("==============================");

			switch (pilihan) {
			case 1:
				String a, b, c;
				System.out.println("Input data mahasiswa: ");
				System.out.println("Nama: ");
				a = in.nextLine();
				System.out.println("NIM: ");
				b = in.nextLine();
				System.out.println("Angkatan: ");
				c = in.nextLine();
				System.out.println("==============================");
				System.out.println("Data sudah disimpan...");
				System.out.println("==============================");

				mhs.add(new Mahasiswa(a, b, c));
				break;
			case 2:
				String d, e;
				int f;
				System.out.println("Input data mata kuliah: ");
				System.out.println("Nama: ");
				d = in.nextLine();
				System.out.println("Kode: ");
				e = in.nextLine();
				System.out.println("SKS: ");
				f = in.nextInt();
				System.out.println("==============================");
				System.out.println("Data sudah disimpan...");
				System.out.println("==============================");

				mk.add(new MataKuliah(d, e, f));
				break;
			case 3:
				String g, h;
				int i;
				System.out.println("Input data mata kuliah: ");
				System.out.println("Nama: ");
				g = in.nextLine();
				System.out.println("Gedung: ");
				h = in.nextLine();
				System.out.println("Kapasitas: ");
				i = in.nextInt();
				System.out.println("==============================");
				System.out.println("Data sudah disimpan...");
				System.out.println("==============================");

				ruang.add(new Ruang(g, h, i));
				break;
			case 4:
				Object[] mhsCase = mhs.toArray();
				for (int j = 0; j < mhs.size(); j++) {
					System.out.println("Mahasiswa ke - " + (j + 1));
					((Mahasiswa) mhsCase[j]).displayInfo();
					System.out.println("==============================");
				}
				System.out.print("Jumlah Mahasiswa yang ada di database: ");
				System.out.println(((Mahasiswa) mhsCase[0]).JumlahMahasiswa());
				break;
			case 5:
				Object[] mkCase = mk.toArray();
				for (int j = 0; j < mk.size(); j++) {
					System.out.println("Mata Kuliah ke - " + (j + 1));
					((MataKuliah) mkCase[j]).displayInfo();
					System.out.println("==============================");
				}
				System.out.print("Jumlah Mata Kuliah yang ada di database: ");
				System.out.println(((MataKuliah) mkCase[0]).JumlahMataKuliah());
				break;
			case 6:
				Object[] ruangCase = ruang.toArray();
				for (int j = 0; j < ruang.size(); j++) {
					System.out.println("Ruang ke - " + (j + 1));
					((Ruang) ruangCase[j]).displayInfo();
					System.out.println("==============================");
				}
				System.out.print("Jumlah Ruang yang ada di database: ");
				System.out.println(((Ruang) ruangCase[0]).JumlahRuang());
				break;
			case 0:
				System.out.println("Terima kasih");
				break;
			default:
				System.out.println("Input salah");
			}
		} while (pilihan != 0);
	}

}