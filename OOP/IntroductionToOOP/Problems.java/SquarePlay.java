
import java.util.Scanner;

class Square{
    double side;
    public double area(double side)
    {
        return side*side;
    }
    public double perimeter(double side)
    {
        return 4*side;
    }
}
public class SquarePlay {
    public static void main(String[] args) {
        Square anika = new Square();
        System.out.println("Enter the side of the square: ");
        Scanner input = new Scanner(System.in);
        double side = input.nextInt();
        anika.side = side;
        System.out.println("The area of the square is: "+anika.area(side));
        System.out.println("The perimeter of the square is: "+ anika.perimeter(side));
    }
}
