class CellPhone{
    public void ringing()
    {
        System.out.println("Ringing");
    }
    public void vibrating()
    {
        System.out.println("Vibrating");
    }
}
public class Mobile {
    public static void main(String[] args) {
        CellPhone nokia = new CellPhone();
        nokia.ringing();
        nokia.vibrating();
    }
}
