
class Studd{
    String name;
    int age;

    public void printINfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Studd(){
        System.out.println("it's called Constructor.");
    }
}

public class Con_Student{
    public static void main(String[] args) {
        
        Studd s1=new Studd();
        s1.name="Prathmesh";
        s1.age=20;

        Studd s2=new Studd();
        s2.name="Shraddha";
        s2.age=19;

        s1.printINfo();
        s2.printINfo();

    }
    
}