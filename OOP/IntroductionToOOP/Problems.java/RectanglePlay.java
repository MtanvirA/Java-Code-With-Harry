import java.util.Scanner;
class Rectangle {

    double length, width;

    public double area(double length, double width) {
        return length*width;
    }

    public double perimeter(double length, double width) {
        return 2*(length+width);
    }
}
public class RectanglePlay {
    public static void main(String[] args) {
        Rectangle anika = new Rectangle();
        System.out.println("Enter the length of the rectangle: ");
        Scanner input = new Scanner(System.in);
        double length = input.nextInt();
        anika.length = length;
        System.out.println("Enter the width of the rectangle: ");
        double width = input.nextInt();
        anika.width = width;
        System.out.println("The area of the square is: " + anika.area(length, width));
        System.out.println("The perimeter of the square is: " + anika.perimeter(width, length));
    }
}
