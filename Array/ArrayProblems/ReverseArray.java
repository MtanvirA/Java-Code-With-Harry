
public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] brr = {7, 8, 9, 10, 11};
        int temp = 0;
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }

        if (brr.length % 2 != 0) {
            for (int i = 0; i < (brr.length / 2); i++) {
                temp = brr[i];
                brr[i] = brr[brr.length - 1 - i];
                brr[brr.length - 1 - i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }

    }
}
