import java.util.Scanner;

public class StringPractise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence: ");

        String sample= input.nextLine();

        System.out.println(sample.indexOf("  "));
        System.out.println(sample.indexOf("   "));

    }
}
