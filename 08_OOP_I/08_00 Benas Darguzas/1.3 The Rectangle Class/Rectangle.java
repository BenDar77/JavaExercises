public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float newLength) {
        length = newLength;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float newWidth) {
        this.width = newWidth;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter(){
        return (2*length) + (2*width);
    }

    public String toString() {
        return "Rectangle [length = " + length + ", width = " + width + "]";
    }
}


