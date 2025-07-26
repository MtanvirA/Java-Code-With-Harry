
import java.util.Scanner;

public class SumOfMul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1; i<=10; i++){
            sum+=(num*i);
        }
        System.out.println("The sum is: "+sum);
    }
}
