package BAB72;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double wage; //upah per jam     
    private double hours; //jumlah jam tiap minggu 

    public HourlyEmployee(String name, String noKTP, int tgl, int bulan, int tahun, double hourlyWage, double hoursWorked) {
        super(name, noKTP, name, tgl, bulan, tahun);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    public void setWage(double hourlyWage) {
        wage = hourlyWage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hoursWorked) {
        hours = hoursWorked;
    }

    public double getHours() {
        return hours;
    }

    public double earnings() {
        LocalDate date = LocalDate.now();
        if (getTglLahir().getMonth() == date.getMonth()) {
            if (getHours() <= 40) {
                return getWage() * getHours() + 100000;
            } else {
                return 40 * getWage() + (getHours() - 40) * getWage() * 1.5 + 100000;
            }
        } else {
            if (getHours() <= 40) {
                return getWage() * getHours();
            } else {
                return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
            }
        }
    }

    public String toString() {
        return String.format("Hourly employee: " + super.toString() + "\nhourly wage: " + getWage() + "\nhours worked: " + getHours());
    }
}