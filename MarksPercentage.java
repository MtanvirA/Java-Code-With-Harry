import java.util.Scanner;

public class MarksPercentage {
    public static void main(String[] args) {
        double phy, mat, cce, cit, eee;
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter the number of your Physics Course");
        phy= userInput.nextDouble();
        System.out.println("Enter the number of your Mathematics Course");
        mat = userInput.nextDouble();
        System.out.println("Enter the number of your EEE Course");
        eee = userInput.nextDouble();
        System.out.println("Enter the number of your CIT Course");
        cit = userInput.nextDouble();
        System.out.println("Enter the number of your CCE Course");
        cce = userInput.nextDouble();
        double avg= (phy+mat+eee+cit+cce)/5;

        System.out.println("Your Result: ");
        System.out.println("Physics: " + phy + "\nMathematics: " + mat + "\nEEE: " + eee + "\nCIT: " + cit + "\nCCE: "+ cce);
        System.out.println("Percentage: " + avg + "%");
    }
}
