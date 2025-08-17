
import java.util.Scanner;

public class ArrayAvg {

    static double avg(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        for(int i=0; i< numbers.length; i++)
        {
            numbers[i]= input.nextInt();
        }
        System.out.println("The average of the numbers in the array is: "+avg(numbers));

    }

}
