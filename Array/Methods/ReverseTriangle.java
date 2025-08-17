import java.util.Scanner;

public class ReverseTriangle {
    static void tPattern(int num) {
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num= input.nextInt();
        tPattern(num);
    }
}
