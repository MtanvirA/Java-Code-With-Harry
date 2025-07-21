import java.util.Scanner;
public class L13_TakingStringInput {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String name;
        System.out.println("Enter your name:");
        name = input.nextLine();
        System.out.println("Your Name is: "+ name);
    }
}
