// Not run just define 

class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Student s1 = new Student("Prathmesh", 20);
        Student s2 = new Student("Rahul", 21);

        s1.display();
        s2.display();
    }
}