
import java.util.Scanner;

public class SumOfnEvenNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int sum=0;
        int count = 0;
        int i = 1;
        while(count<n)
        {
            if(i%2==0)
            {
                sum+=i;
                count++;
            }
            i++;
        }
        System.out.println("Total sum: "+sum);
    }
}
