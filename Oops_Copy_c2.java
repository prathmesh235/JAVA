

class Stud1{
    String name;
    int age;

    public void printINfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Stud1(Stud1 s){
        this.name=s.name;
        this.age=s.age;
        
    }
    Stud1(){

    }
}

public class Oops_Copy_c2{
    public static void main(String[] args) {
        
        Stud1 s1=new Stud1();
        s1.name="Prathmesh";
        s1.age=20;
        
        Stud1 s2=new Stud1();
        s2.name="Shraddha";
        s2.age=19;

        Stud1 s3=new Stud1(s2);
        s3.printINfo();
        

    }
    
}