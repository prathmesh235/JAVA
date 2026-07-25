class Car {
    String brand;
    String color;
    int speed;

    void start() {
        System.out.println(brand + " is starting.");
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        // Create object
        Car car1 = new Car();

        // Assign values
        car1.brand = "Toyota";
        car1.color = "Black";
        car1.speed = 120;

        // Call methods
        car1.start();
        car1.display();
    }
}