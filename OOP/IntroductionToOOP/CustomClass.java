
class Student {

    int id;
    String name;
    public void dream(){
        System.out.println("I like doing competitive programming and I love developing projects that solve real life problems!");
    }
}

public class CustomClass {

    public static void main(String[] args) {
        Student tanvir = new Student();
        tanvir.id = 2302068;
        tanvir.name = "Md. Tanvir Anjum";
        System.out.println("ID: " + tanvir.id + "\nName: " + tanvir.name);
        tanvir.dream();
    }
}
