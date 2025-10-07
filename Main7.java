import java.util.Scanner;
abstract class Transport {
    abstract double calculateFare(double distance);
}
class Bus extends Transport {
    @Override
    double calculateFare(double distance) {
        return distance * 5;  
    }
}
class Train extends Transport {
    @Override
    double calculateFare(double distance) {
        return distance * 3;  
    }
}
class Flight extends Transport {
    @Override
    double calculateFare(double distance) {
        return distance * 10; 
    }
}
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Transport Type: 1.Bus  2.Train  3.Flight");
        int choice = sc.nextInt();

        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        Transport t; 
        if (choice == 1) {
            t = new Bus();
        } else if (choice == 2) {
            t = new Train();
        } else if (choice == 3) {
            t = new Flight();
        } else {
            System.out.println("Invalid choice!");
            return;
        }
        double fare = t.calculateFare(distance);
        System.out.println("Total Fare = Rs. " + fare);
    }
}
