public class ShapeApp {
    public static void main(String[] args) {
        Shape s1, s2, s3;

        s1 = new Rectangle(3.0, 4.0, "green");
        s2 = new Rectangle(3.0, 4.0, "green");
        s3 = new Triangle(3.0, 4.0, 5.0, "green");

        System.out.println(s1);
        System.out.println(s3);

        System.out.println(s1.equals(s2)); // true
        System.out.println(s3.equals(s2)); // false
        // Shape s5 = new Shape("black");
    }
}