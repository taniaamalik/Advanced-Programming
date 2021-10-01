package BAB72;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double weeklySalary; //gaji/minggu 

    public SalariedEmployee(String name, String noKTP, int tgl, int bulan, int tahun, double salary) {
        super(name, noKTP, name, tgl, bulan, tahun);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public double earnings() {
        LocalDate date = LocalDate.now();
        if (getTglLahir().getMonth() == date.getMonth()) {
            return getWeeklySalary() + 100000;
        } else {
            return getWeeklySalary();
        }
    }

    public String toString() {
        return String.format("Salaried employee: " + super.toString() + "\nweekly salary: " + getWeeklySalary());
    }
}