import java.util.Scanner;
public class StringPractiseSolve1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your College Name: ");
        String cname= input.nextLine();
        System.out.println("Your college name in lower case is: "+ cname.toLowerCase());
    }
}
