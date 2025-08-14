import java.util.Scanner;
public class L14_StringMethods {
    public static void main(String[] args) {
        //creating input object using the Scanner class
        Scanner input= new Scanner(System.in);
        String name;
        System.out.println("Enter your full name: ");
        //taking input
        name  = input.nextLine();
        //measuring the length of the String using the 'length()' method
        int len = name.length();
        System.out.println("The length of your full name is: " + len);

        //printing the name in all lower case using the "toLowerCase()" method
        String lName = name.toLowerCase();
        System.out.println("Your name in all lower case is: " + lName);

        //printing the name in all upper case using the "toUpperCase()" method
        String uName= name.toUpperCase();
        System.out.println("Your name in full upper case is: " + uName);

        //String trimming: trim(), it only trims the leading and the ending spaces
        String trimString= name.trim();
        System.out.println("The trimmed string is: " + trimString);


        //printing a particular part of a string using the "substring(x,y);" method, where x and y represents the beginning and the after-ending index of that string

        System.out.println("The part of the name is: " + name.substring(4, 12));

        //replace any character with the help of replace() method
        System.out.println(name.replace('T', 'A'));

        //also we can replace multiple characters with the help of replace("", "") method
        System.out.println(name.replace("Tanvir", "Rivnat"));

        //we have kind of a boolean method  such as startsWith("") and endsWith("") methods which will return true or false value depending upon the string
        System.out.println(name.startsWith("Md."));
        System.out.println(name.endsWith("um"));

        //charAt() --> this method helps us to take the specific character at an index
        System.out.println(name.charAt(5));

        //indexOf() --> this method helps us find the index of a character that is encountered first from the left side
        System.out.println(name.indexOf('A', 6));

        //equals() --> this method is used to check is the sting is equal or not
        //equalsIgnoreCase() --> this method is used to check is the strings are equal or not regardless of their cases

        System.out.println(name.equals("Md. Tanvir Anjum"));
        System.out.println(name.equals("md. tanvir anjum"));
        System.out.println(name.equalsIgnoreCase("md. Tanvir anjum"));


    }
}
