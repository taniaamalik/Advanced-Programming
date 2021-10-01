package BAB8;

public class Invoice implements Payable {

    String productName;
    Integer quantity;
    Integer pricePerItem;

    public Invoice(String pn, Integer quantity, Integer ppi) {
        this.productName = pn;
        this.quantity = quantity;
        this.pricePerItem = ppi;
    }

    public Integer getPayableAmount() {
        return quantity * pricePerItem;
    }
}