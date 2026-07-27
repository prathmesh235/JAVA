
class Penn{
    String color;
    String type;

    public void printwrite(){
        System.out.println("Hello I'm Penn.");
    }
    public void printcolor(){
        System.out.println(this.color);
    }

    public void printtype(){
        System.out.println(this.type);
    }
}
public class Oops_this{
    public static void main(String[] args) {
        Penn Penn1 =new Penn();
        Penn1.color="red";
        Penn1.type="Fountain";

        Penn Penn2 =new Penn();
        Penn2.color="Sky blue";
        Penn2.type="Gell";

        
        Penn1.printcolor();
        Penn2.printcolor();

        Penn1.printtype();
        Penn2.printtype();

        
    }
    
}