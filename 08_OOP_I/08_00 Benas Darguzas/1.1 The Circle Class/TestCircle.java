public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(1.2);
        Circle c4 = new Circle();
        c4.setRadius(5.0);
        c4.setColor("yellow");


        System.out.println("The circle has radius of " + c1.getRadius() + " and are of " + c1.getArea());
        System.out.println("The circle has radius of " + c2.getRadius() + " and are of " + c2.getArea());
        System.out.println("The color of the circle is " + c1.getColor());
        System.out.println("radius is " + c4.getRadius());
        System.out.println("the color is " + c4.getColor());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c2);


    }



}
