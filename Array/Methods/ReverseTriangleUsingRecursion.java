
import java.util.Scanner;

public class ReverseTriangleUsingRecursion {

    static void printStar(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("* ");
        }
        System.out.println("");
    }

    static int detStars(int num) {
        if (num == 0) {
            return 0;
        }

        printStar(num);
        detStars(num - 1);
        return 0;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num = input.nextInt();
        detStars(num);
    }
}
