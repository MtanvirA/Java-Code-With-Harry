class Employee{
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String str)
    {
        name = str;
    }


}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee tanvir = new Employee();
        tanvir.salary = 75000;
        tanvir.setName("Md. Tanvir Anjum");
        System.out.println(tanvir.salary);
        System.out.println(tanvir.name);
    }
}
