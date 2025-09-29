class Car {
    String brand;
    String model;
    int year;

    // No-argument constructor
    Car() {
        this("Unknown", "Unknown", 0);
    }

    // One-argument constructor
    Car(String brand) {
        this(brand, "Unknown", 0);
    }

    // Three-argument constructor
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Toyota");
        Car c3 = new Car("Honda", "Civic", 2022);

        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
    }
}
