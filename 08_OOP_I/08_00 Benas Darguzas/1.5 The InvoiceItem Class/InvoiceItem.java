public class InvoiceItem {
    private final String id;
    private final String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        System.out.print("Quantity is: ");
        return qty;
    }

    public void setQty(int newQty) {
        System.out.println("Setting new quantity to " + newQty);
        qty = newQty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double newUnitPrice) {
        System.out.println("Setting new unit price to " + newUnitPrice);
        unitPrice = newUnitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    public String toString(){
        return "InvoiceItem [id= " + id + ",desc = " + desc + ",qty = " + qty + ",unitPrice = " + unitPrice + " ]";
    }
}
