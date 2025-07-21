import java.util.Scanner;

public class StringPractiseSolve3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the girl of your liking: ");
        String name = input.nextLine();
        String temp= "I love you, <|girl|>.";
        String lob = temp.replace("<|girl|>", name);
        System.out.println("Your final words: " + lob);

    }
}
