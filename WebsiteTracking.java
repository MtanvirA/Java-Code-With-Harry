
import java.util.Scanner;

public class WebsiteTracking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String web;
        System.out.println("Enter the url of the website: ");
        web = input.nextLine();
        if(web.endsWith(".com"))
        {
            System.out.println("This is a commercial website");
        }
        else if(web.endsWith(".org"))
        {
            System.out.println("This is a organizational website");
        }
        else if(web.endsWith(".bd"))
        {
            System.out.println("This is a Bangladeshi website");
        }
        else{
            System.out.println("Other kind of website");
        }
    }
}
