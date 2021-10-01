package BAB73;

public class SalaryBasedOnProduct extends Employee {
    private double upah;
    private double produk;

    public SalaryBasedOnProduct(String name, String noKTP, double upah, double produk) {
        super(name, noKTP);
        this.upah = upah;
        this.produk = produk;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setProduk(double produk) {
        this.produk = produk;
    }

    public double getProduk() {
        return produk;
    }

    public double earnings() {
        return upah * produk;
    }

    public String toString() {
        return String.format("Salaried Based On Product : " + super.toString()
                + "\nupah :" + getUpah() + "\nproduk perminggu : " + getProduk());
    }
}