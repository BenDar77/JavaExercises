public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(2);
        r1.setWidth(2);

        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        System.out.println(r1.getClass());
    }

}
