

class Shape123{

    public void area() {
        System.out.println("This is shape area");
    }
}

class Triangle123 extends Shape123 {

    public void area(int h, int b) {
        System.out.println((h * b) / 2.0);
    }
}
class EqualilateralTriangle1 extends Shape123 {

    public void area(int h, int b) {
        System.out.println((h * b) / 2.0);
    }
}

class Circle extends Shape123 {

    public void area(int r) {
        System.out.println(3.14*r*r);
    }
}

public class Hierarchial_inheritance {
    public static void main(String[] args) {

        Circle t1 = new Circle();

        t1.area();
        t1.area(5);

    }
}
