import java.util.Scanner;

public class StringPractiseSolve2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your College Name: ");
        String cname= input.nextLine();
        System.out.println("Your college name with underscore: " + cname.replace(' ', '_'));
    }
}
