import  java.util.Scanner;
public class ConditionalPractise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary, tax;
        System.out.println("Enter the amount of your salary: ");
        salary = input.nextDouble();
        if(salary>1000000)
        {
            tax = salary * (.3);
            System.out.println("Your income tax is: " + tax);
        }
        else if(salary>500000)
        {
            tax = salary * (.2);
            System.out.println("Your income tax is: " + tax);
        }
        else if(salary>250000)
        {
            tax = salary * (.05);
            System.out.println("Your income tax is: " + tax);
        }
        else
        {
            tax = 0;
            System.out.println("Your income tax is: " + tax);
        }
    }
}
