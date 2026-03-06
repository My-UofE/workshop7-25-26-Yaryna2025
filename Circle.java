/*
 * Circle class for the Inheritance Workshop
 */
public class Circle {
    // Private instance variables
    private double radius;
    private String color;

    
    // No-arg constructor
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor with radius only
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // Constructor with radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Describe the Circle
    @Override
    public String toString() {
        return String.format("Circle[radius=%.2f,color=%s]", radius, color);
    }

    // Return the area of the Circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Instance method for class info (for polymorphism test)
    public void printClassInfo() {
        System.out.println("It is a Circle class");
    }

    // Static method for class info (for polymorphism test)
    public static void printClassInfoStatic() {
        System.out.println("It is a Circle class");
    }
}