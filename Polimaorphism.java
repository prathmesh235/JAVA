

class Stud12{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    
    public void printInfo(int age){
        System.out.println(age);
    }

    
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
    

}

public class Polimaorphism{
    public static void main(String[] args) {
        
        Stud12 s1=new Stud12();
        s1.name="Prathmesh";
        s1.age=20;
        
        s1.printInfo(s1.name,s1.age);
        

    }
    
}
