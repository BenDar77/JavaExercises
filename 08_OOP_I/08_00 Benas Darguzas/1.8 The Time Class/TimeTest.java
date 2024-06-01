public class TimeTest {
    public static void main(String[] args) {
Time t1 = new Time(12, 14,54);

        System.out.println(t1.getHour());
        System.out.println(t1.getMinute());
        System.out.println(t1.getSecond());
        t1.setHour(20);
        t1.setMinute(11);
        t1.setSecond(51);
        System.out.println(t1);
        t1.nextSecond();
        System.out.println(t1);
        t1.previousSecond();
        System.out.println(t1);
    }
}
