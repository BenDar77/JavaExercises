public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5.0);

        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1);
    }
}
