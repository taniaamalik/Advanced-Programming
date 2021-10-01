package BAB72;

import java.time.LocalDate;

public class CommissionEmployee extends Employee {
    private double grossSales;//penjualan per minggu     
    private double commissionRate;//komisi     

    public CommissionEmployee(String name, String noKTP, int tgl, int bulan, int tahun, double sales, double rate) {
        super(name, noKTP, name, tgl, bulan, tahun);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales) {
        grossSales = sales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        commissionRate = rate;
    }

    public double getCommissionRate() {
            return commissionRate;
    }

    public double earnings() {
        LocalDate date = LocalDate.now();
        if (getTglLahir().getMonth() == date.getMonth()) {
            return getCommissionRate() * getGrossSales() + 100000;
        } else {
         return getCommissionRate() * getGrossSales();
        }
    }

    public String toString() {
        return String.format("Commision employee: " + super.toString() + "\ngross sales: " + getGrossSales() + "\ncommission rate: " + getCommissionRate());
    }
}