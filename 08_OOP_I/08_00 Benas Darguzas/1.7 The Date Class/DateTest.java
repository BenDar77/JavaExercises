public class DateTest {
    public static void main(String[] args) {
Date d1 = new Date(31, 11,2000);

        System.out.println(d1.getDay());
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear());
        System.out.println(d1);
        d1.setDay(27);
        d1.setMonth(10);
        d1.setYear(2000);
        System.out.println(d1);
        d1.setDate(41,21,1400);
        System.out.println(d1);
    }
}
