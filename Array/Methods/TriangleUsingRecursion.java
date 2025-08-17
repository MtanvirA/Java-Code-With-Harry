
import java.util.Scanner;

public class TriangleUsingRecursion {

    static void printStar(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("* ");
        }
        System.out.println("");
    }

    static int detStars(int num, int primary) {

        if (primary > num) {
            return 0;
        }

        printStar(primary);
        detStars(num, ++primary);
        return 0;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num = input.nextInt();
        int primary = 1;
        detStars(num, primary);
    }
}
