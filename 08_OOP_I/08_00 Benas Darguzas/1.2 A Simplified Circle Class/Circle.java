public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle( double r) {
        this.radius = r;
    }

    public double getRadius() {return radius;}

    public void setRadius(double newRadius){
        radius = newRadius;
    }

    public double getArea() {return radius*radius*Math.PI;}

    public double getCircumference() {return 2*Math.PI*radius;}

    public String toString() {
        return "Circle[radius = " + radius + "]";
    }
}
