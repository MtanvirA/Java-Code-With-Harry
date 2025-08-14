
import java.util.Scanner;

public class MaximumElement {

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the integer elements of the array: ");
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum integer in the array is: " + max);
    }
}
