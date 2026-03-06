/*
 * A Cylinder is a Circle plus a height.
 */
public class Cylinder extends Circle {

    // Private instance variable
    private double height;


    // No-arg constructor
    public Cylinder() {
        super();         
        height = 1.0;    
    }

    // Constructor with radius and height
    public Cylinder(double radius, double height) {
        super(radius);   
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Volume = base area * height
    public double getVolume() {
        return super.getArea() * height;  
    }

    // Override getArea to return surface area of cylinder
    @Override
    public double getArea() {
        double baseArea = super.getArea();            
        double circumference = 2 * Math.PI * getRadius(); 
        return 2 * baseArea + circumference * height; 
    }

    // Access base area (circle area)
    public double getBaseArea() {
        return super.getArea();
    }

    @Override
    public void printClassInfo() {
        System.out.println("It is a Cylinder class");
    }

    public static void printClassInfoStatic() {
        System.out.println("It is a Cylinder class");
    }
}