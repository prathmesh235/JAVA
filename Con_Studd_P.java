

class Studd{
    String name;
    int age;

    public void printINfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Studd(String name,int age){
        this.name=name;
        this.age=age;
        
    }
}

public class Con_Studd_P{
    public static void main(String[] args) {
        
        Studd s1=new Studd("Prathmesh",20);
        
        Studd s2=new Studd("Shraddha",19);
        

        s1.printINfo();
        s2.printINfo();

    }
    
}