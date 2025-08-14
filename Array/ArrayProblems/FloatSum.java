
public class FloatSum {

    public static void main(String[] args) {
        float[] cgpas = new float[5];
        cgpas = new float[]{3.92f, 3.87f, 3.23f, 3.13f, 2.75f};
        float sum = 0;
        for (float cgpa : cgpas) {
            sum += cgpa;
        }
        System.out.println("Total CGPAS: " + sum);

    }
}
