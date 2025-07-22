import java.util.Scanner;
public class ConditionalPractise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double phy, eee, cce, total;

        System.out.println("Enter the marks of your Physics exam: ");
        phy= input.nextDouble();
        System.out.println("Enter the marks of your EEE exam: ");
        eee = input.nextDouble();
        System.out.println("Enter the marks of your CCE exam: ");
        cce = input.nextDouble();
        total = phy + eee + cce;
        if( phy>=33 && eee >= 33 && cce>= 33 && total >= 120)
        {
            System.out.println("Congratulations, You have passed the exam!");
        }
        else
        {
            System.out.println("You have failed the exam");
        }
    }
}
