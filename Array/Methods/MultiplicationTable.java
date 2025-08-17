import java.util.Scanner;

public class MultiplicationTable {
    static void mulTable(int num)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.format("%d x %d = %d\n", num, i, num*i);
            
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= input.nextInt();
        mulTable(num);
    }
}
