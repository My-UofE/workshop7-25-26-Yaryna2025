public class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructors
    public Rectangle() {
        super();
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Implement abstract methods
    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    // Override toString
    @Override
    public String toString() {
        return String.format("Rectangle[width=%.2f,height=%.2f,color=%s,area=%.2f,perimeter=%.2f]",
                             width, height, getColor(), area(), perimeter());
    }

    // Override equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return this.width == other.width &&
                   this.height == other.height &&
                   this.getColor().equals(other.getColor());
        }
        return false;
    }
}