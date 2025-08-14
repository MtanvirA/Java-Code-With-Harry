
public class MultidimentionalArray {

    public static void main(String[] args) {
        int[][] flats = new int[3][3];
        flats = new int[][]{
            {101, 102, 103},
            {201, 202, 203},
            {301, 302, 303}
        };
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        };
    }
}
