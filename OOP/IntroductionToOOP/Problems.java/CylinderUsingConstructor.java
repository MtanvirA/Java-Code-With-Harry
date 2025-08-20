
class Cylinder {

    private double radius;
    private double height;

    Cylinder(double num1, double num2){
        radius = num1;
        height = num2;

    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return 2 * 3.1416 * radius * (radius + height);
    }

    public double getVolume() {
        return 3.1416 * radius * radius * height;
    }

}
public class CylinderUsingConstructor {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(1.5, 6.5);
        System.out.println("The radius of the cylinder is: " + obj.getRadius());
        System.out.println("The height of the cylinder is: " + obj.getHeight());

        System.out.println("The surface area of the cylinder is: " + obj.getArea() + " and the volume of the cylinder is: " + obj.getVolume());
    }
}
