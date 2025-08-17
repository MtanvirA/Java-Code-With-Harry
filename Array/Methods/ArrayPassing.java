public class ArrayPassing {
    static void passArray(int[] arr)
    {
        arr[0]= 25;

    }
    public static void main(String[] args) {
        int [] arr = {78, 56, 86, 92, 97};
        passArray(arr);
        System.out.println("New array after passing is: "+arr[0]);
        for(int ar: arr)
        {
            System.out.println(ar);
        }

    }
}
