
public class VarArgs {

    static int sum(int... arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of the numbers are: " + sum(3, 4, 5));
        System.out.println("The sum of the numbers are: " + sum(3, 4, 5, 6));
        System.out.println("The sum of the numbers are: " + sum(3, 4, 5, 6, 7));

    }
}
