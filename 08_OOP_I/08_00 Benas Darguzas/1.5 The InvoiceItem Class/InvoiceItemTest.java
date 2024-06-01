public class InvoiceItemTest {
    public static void main(String[] args) {
        InvoiceItem i1 = new InvoiceItem("ii_1MtGUtLkdIwHu7ixBYwjAM00", "T-shirt", 1200,0.90);

        System.out.println(i1);
        System.out.println(i1.getId());
        System.out.println(i1.getDesc());
        System.out.println(i1.getQty());
        System.out.println(i1.getUnitPrice());
        System.out.println(i1.getTotal());
        i1.setQty(1000);
        i1.setUnitPrice(1.1);
        System.out.println(i1.getTotal());

    }

}
