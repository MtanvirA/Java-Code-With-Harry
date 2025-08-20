class Cylinder{
    private double radius;
    private double height;

    public void setRadius(double num)
    {
        radius = num;
    }
    public void setHeight(double num)
    {
        height = num;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }

}

public class CylinderMeasure {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        obj.setHeight(9.5);
        obj.setRadius(1.5);
        System.out.println("The radius of the cylinder is: "+ obj.getRadius());
        System.out.println("The height of the cylinder is: "+ obj.getHeight());
    }
    
}
