


class Shape12{

    public void area() {
        System.out.println("This is shape area");
    }
}

class Triangle12 extends Shape12 {

    public void area(int h, int b) {
        System.out.println((h * b) / 2.0);
    }
}
class EqualilateralTriangle extends Shape12 {

    public void area(int h, int b) {
        System.out.println((h * b) / 2.0);
    }
}

public class Mul_lvl_inheritance {
    public static void main(String[] args) {

        Triangle12 t1 = new Triangle12();

        t1.area();
        t1.area(10, 7);

    }
}
