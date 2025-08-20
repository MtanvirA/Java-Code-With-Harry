
class Cylinder {

    private double radius;
    private double height;

    public void setRadius(double num) {
        radius = num;
    }

    public void setHeight(double num) {
        height = num;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double getArea()
    {
        return 2*3.1416*radius*(radius+height);
    }

    public double getVolume()
    {
        return 3.1416*radius*radius*height;
    }


}

public class CylinderProperties {

    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        obj.setHeight(9.5);
        obj.setRadius(1.5);
        System.out.println("The radius of the cylinder is: " + obj.getRadius());
        System.out.println("The height of the cylinder is: " + obj.getHeight());

        System.out.println("The surface area of the cylinder is: "+ obj.getArea()+ " and the volume of the cylinder is: "+ obj.getVolume());
    }
}
