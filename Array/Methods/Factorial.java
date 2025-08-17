
import java.util.Scanner;

public class Factorial {
    static int factorial(int num){
        int result=1;
        if(num==0) {
            return 1;
        }
        else{
            for(int i=1; i<=num; i++)
            {
                result*=i;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= input.nextInt();
        System.out.println("Factorial of the number is: "+ factorial(num));
    }
}
