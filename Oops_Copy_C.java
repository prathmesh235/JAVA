
class Studdd{
    String name;
    int age;

    public void printINfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Studdd(Studdd s2){
        this.name=s2.name;
        this.age=s2.age;
        
    }
    
    Studdd(){

    }
}

public class Oops_Copy_C{
    public static void main(String[] args) {
        
        Studdd s1=new Studdd();
        s1.name="Prathmesh";
        s1.age=19;
        
        Studdd s2=new Studdd(s1);
        s2.printINfo();
        

    }
    
}