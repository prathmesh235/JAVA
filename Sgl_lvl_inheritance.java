


class Shape11{

    public void area() {
        System.out.println("This is shape area");
    }
}

class Triangle1 extends Shape11 {

    public void area(int h, int b) {
        System.out.println((h * b) / 2.0);
    }
}

public class Sgl_lvl_inheritance {
    public static void main(String[] args) {

        Triangle1 t1 = new Triangle1();

        t1.area();
        t1.area(10, 20);

    }
}