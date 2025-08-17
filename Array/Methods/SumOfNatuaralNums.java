
import java.util.Scanner;

public class SumOfNatuaralNums {

    static int sum(int num) {
        if(num<=0)
        {
            System.out.println("Error!");
            return 0;
        }
        else if (num == 1) {
            return 1; 
        }else {
            return num + sum(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        System.out.println("Sum of the first n natural number is: "+ sum(num));
    }
}
