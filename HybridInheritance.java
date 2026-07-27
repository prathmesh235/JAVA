interface Animal {
    void eat();
}

interface Mammal extends Animal {
    void walk();
}

interface Pet extends Animal {
    void play();
}

class Dog implements Mammal, Pet {

    public void eat() {
        System.out.println("Dog eats food.");
    }

    public void walk() {
        System.out.println("Dog walks on four legs.");
    }

    public void play() {
        System.out.println("Dog plays with a ball.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.walk();
        d.play();
    }
}