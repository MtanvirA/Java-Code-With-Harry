
import java.util.Scanner;

public class LoopProblem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = input.nextInt();
        for (int j = n; j >= 0; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}
