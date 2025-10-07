import java.util.*;
class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    double calculateDiscount() {
        return 0;
    }

    double getFinalPrice() {
        return price - calculateDiscount();
    }
}
class Electronics extends Product {
    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.10; 
    }
}
class Clothing extends Product {
    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.20; 
    }
}
class Groceries extends Product {
    Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.05;
    }
}
public class Main6 {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();

        cart.add(new Electronics(1, "Laptop", 50000));
        cart.add(new Clothing(2, "Shirt", 1000));
        cart.add(new Groceries(3, "Rice Bag", 1500));

        double totalBill = 0;

        System.out.println("---- Shopping Cart ----");
        for (Product p : cart) {
            double finalPrice = p.getFinalPrice();
            System.out.println(p.name + " | Original Price: " + p.price + " | Final Price: " + finalPrice);
            totalBill += finalPrice;
        }
        System.out.println("Total Bill Amount: " + totalBill);
    }
}
