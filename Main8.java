import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class LibraryUser {
    int userId;
    String name;

    LibraryUser(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    int maxBooksAllowed() {
        return 0;  
    }
}
class Student extends LibraryUser {
    Student(int userId, String name) {
        super(userId, name);
    }

    @Override
    int maxBooksAllowed() {
        return 3;  
    }
}
class Teacher extends LibraryUser {
    Teacher(int userId, String name) {
        super(userId, name);
    }

    @Override
    int maxBooksAllowed() {
        return 5;  
    }
}
class Researcher extends LibraryUser {
    Researcher(int userId, String name) {
        super(userId, name);
    }

    @Override
    int maxBooksAllowed() {
        return 7;  
    }
}
public class Main8 {
    public static void main(String[] args) {
        List<LibraryUser> users = new ArrayList<>();

        users.add(new Student(101, "Mukul"));
        users.add(new Teacher(102, "Ravi"));
        users.add(new Researcher(103, "Anita"));

        System.out.println("---- Library Borrowing Report ----");

        StringBuilder report = new StringBuilder();

        for (LibraryUser u : users) {
            String line = "User: " + u.name + " (ID: " + u.userId + ")" + " | Max Books Allowed: " + u.maxBooksAllowed();
            System.out.println(line);
            report.append(line).append("\n");
        }
        try {
            FileWriter fw = new FileWriter("LibraryReport.txt");
            fw.write(report.toString());
            fw.close();
            System.out.println("\nReport written to LibraryReport.txt successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
