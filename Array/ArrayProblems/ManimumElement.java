
import java.util.Scanner;

public class ManimumElement {

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the integer elements of the array: ");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The maximum integer in the array is: " + min);
    }
}
