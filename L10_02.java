public class L10_02 {
    public static void main(String[] args) {
        char grade = 'A';
        //encrypting
        grade= (char) (grade+10);
        System.out.println("My grade is: "+grade);
        //decrypting
        grade = (char) (grade-10);
        System.out.println("My original grade is: " + grade);
    }
}
