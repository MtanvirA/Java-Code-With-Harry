import java.util.Scanner;

public class IntegerTest {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter the number: ");
        System.out.println(userInput.hasNextInt());
    }
}
