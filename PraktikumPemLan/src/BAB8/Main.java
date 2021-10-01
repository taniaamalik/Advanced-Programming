package BAB8;

public class Main {

    public static void main(String[] args) {
        Invoice[] i = new Invoice[3];
        i[0] = new Invoice("Wakai", 3, 500000);
        i[1] = new Invoice("JanSport", 1, 350000);
        i[2] = new Invoice("Nature Republic", 5, 120000);
        Invoice[] invoice = new Invoice[]{i[0], i[1], i[2]};
        Employee e = new Employee(123, "Tania Malik", 7500000, invoice);
        System.out.println("--------------------INFORMASI KARYAWAN--------------------");
        System.out.println("No. Registrasi               : " + e.registrationNumber);
        System.out.println("Nama                         : " + e.name);
        System.out.println("Gaji PerBulan                : Rp. " + e.salaryPerMonth);
        System.out.println("Total Gaji(setelah dipotong) : Rp. " + e.getPayableAmount());
        System.out.println("-------------------------PEMBELIAN------------------------");
        for (int j = 0; j < invoice.length; j++) {
            System.out.println("Nama Produk   : " + i[j].productName);
            System.out.println("Jumlah Produk : " + i[j].quantity);
            System.out.println("Harga Produk  : Rp. " + i[j].pricePerItem);
            System.out.println("Total Bayar   : Rp. " + i[j].getPayableAmount());
            System.out.println("-----------------------------------------------------------");
        }
    }
}