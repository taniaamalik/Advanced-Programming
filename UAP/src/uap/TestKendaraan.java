package uap;

public class TestKendaraan {

    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        Motor motor = new Motor();
        System.out.print("Cara ngebut pake motor: ");
        motor.tambahKecepatan();
        System.out.print("Cara berhentinya: ");
        motor.kurangiKecepatan();
        System.out.print("Cara balapan pake mobil: ");
        mobil.tambahKecepatan();
        System.out.print("Cara berhentinya: ");
        mobil.kurangiKecepatan();
    }
}