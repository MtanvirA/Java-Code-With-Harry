
import java.util.Scanner;

public class Fibonacchi {

    static int fibo(int num) {
        if (num == 1 || num == 2) {
            return 1; 
        }else {
            return fibo(num - 1) + fibo(num - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num = input.nextInt();
        System.out.println("The nth fibonacchi term is: "+ fibo(num));
    }
}
