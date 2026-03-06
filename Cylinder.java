/*
 * A Cylinder is a Circle plus a height.
 */

public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

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

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public double getArea() {

        double baseArea = super.getArea();
        double circumference = 2 * Math.PI * getRadius();

        return 2 * baseArea + circumference * height;
    }

    public double getBaseArea() {
        return super.getArea();
    }
}