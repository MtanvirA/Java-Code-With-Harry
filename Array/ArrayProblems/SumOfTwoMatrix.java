
public class SumOfTwoMatrix {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] brr = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] sum;
        sum = new int[2][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum[i][j] = arr[i][j] + brr[i][j];
            }
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        };

    }
}
