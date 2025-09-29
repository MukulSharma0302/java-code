// Person Class With Constructor
class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person's details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Person p1 = new Person();
        p1.display();

        // Using parameterized constructor
        Person p2 = new Person("Alice", 25);
        p2.display();

        // Using copy constructor
        Person p3 = new Person(p2);
        p3.display();
    }
}
