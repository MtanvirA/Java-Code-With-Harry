

public class FindingHer {
    public static void main(String[] args) {
        int[] numbers = {78, 25, 4, 5, 4, 23, 2};
        int num = 10;
        boolean find = false;
        for(int number: numbers){
            if(number==num)
            {
                find = true;
                break;
            }
        }
        if(find)
        {
            System.out.println("The number is in the array!");
        }
        else
        {
            System.out.println("The number is not in the array!");
        }
    }
}
