
public class FruitOfCultivation {
    public static void main(String[] args) {
        int [] numbers = {69, 75, 46, 98,  34};
        int sum = 0;
        for(int number: numbers)
        {
            sum+=number;
        };
        double average= sum/(double)(numbers.length);
        System.out.println("The average is: "+average);
    }    
}
