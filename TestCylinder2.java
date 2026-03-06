/*
 * Another test driver for the Cylinder class.
 */
public class TestCylinder2 {
    public static void main(String[] args) {
        Circle cy2 = new Cylinder(5.0, 2.0); 

        double h = ((Cylinder)cy2).getHeight();   // downcast to access Cylinder methods
        double r = cy2.getRadius();               // getRadius() is in Circle
        double a = cy2.getArea();                 // overridden method, calls Cylinder's getArea()
        double v = ((Cylinder)cy2).getVolume();   // downcast again for getVolume()

        System.out.printf("Height: %.2f, Radius: %.2f, Area: %.2f, Volume: %.2f\n",
                           h, r, a, v);

        System.out.println("\nInstance methods:");
        Circle c3 = new Circle();
        c3.printClassInfo();

        Cylinder cy4 = new Cylinder();
        cy4.printClassInfo();

        Circle cy5 = new Cylinder(); 
        cy5.printClassInfo();

        System.out.println("\nStatic methods:");
        cy4.printClassInfoStatic();
        cy5.printClassInfoStatic();
    }
}