
class The_Pen{
    String Color;
    String Type;

    public void Write(){
        System.out.println("I'm a Pen.");
    }
    public void printColor(){
        System.out.println(this.Color);
    }
}
public class OOPS_Pen2 {
    public static void main(String[] args) {
        The_Pen Pen1 =new The_Pen();
        Pen1.Color ="red";
        Pen1.Type="Ball";


       The_Pen Pen2 =new The_Pen();
        Pen2.Color ="black";
        Pen2.Type="Gel";

       Pen1.printColor();
       Pen2.printColor();
       
    }
}
