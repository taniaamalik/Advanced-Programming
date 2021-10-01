package BAB8;

public class Employee implements Payable {
    Integer registrationNumber;
    String name;
    Integer salaryPerMonth;
    Invoice[] invoice;

    public Employee(Integer rn, String name, Integer spm, Invoice[] invoice) {
        this.registrationNumber = rn;
        this.name = name;
        this.salaryPerMonth = spm;
        this.invoice = invoice;
    }

    public Integer getPayableAmount() {
        Integer totalHarga = 0;
        for (int i = 0; i < invoice.length; i++) {
            totalHarga += invoice[i].getPayableAmount();
        }
        return salaryPerMonth - totalHarga;
    }
}