class Penn{
    String color;
    String type;

    public void printwrite(){
        System.out.println("Hello I'm Penn.");
    }
}
public class Oops_write {
    public static void main(String[] args) {
        Penn Penn1 =new Penn();
        Penn1.color="red";
        Penn1.type="Fountain";

        Penn1.printwrite();
        
    }
    
}