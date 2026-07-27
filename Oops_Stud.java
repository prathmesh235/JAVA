
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

class Stud{
    String name;
    int age;

    public void printINfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
}

public class Oops_Stud{
    public static void main(String[] args) {
        
        Stud s1=new Stud();
        s1.name="Prathmesh";
        s1.age=20;

        Stud s2=new Stud();
        s2.name="Shraddha";
        s2.age=19;

        s1.printINfo();
        s2.printINfo();



        
        

        
    }
    
}