public abstract class Shape {
    private String color;

    // No-arg constructor, default color "red"
    public Shape() {
        this.color = "red";
    }

    // Constructor with color
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Abstract methods
    public abstract double area();
    public abstract double perimeter();
}