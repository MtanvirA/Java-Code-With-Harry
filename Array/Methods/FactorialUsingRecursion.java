
import java.util.Scanner;

public class FactorialUsingRecursion {

    static int factorial(int num) {
        if (num == 0) {
            return 1; 
        }else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        System.out.println("Factorial of the number is: " + factorial(num));
    }
}
