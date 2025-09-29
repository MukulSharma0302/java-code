// Base class
class Student {
    int rollNo;
    String name, course;

    Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }
}

// Subclass Marks
class Marks extends Student {
    int m1, m2, m3;

    Marks(int rollNo, String name, String course, int m1, int m2, int m3) {
        super(rollNo, name, course);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

// Subclass Result
class Result extends Marks {
    int total;
    double percentage;
    char grade;

    Result(int rollNo, String name, String course, int m1, int m2, int m3) {
        super(rollNo, name, course, m1, m2, m3);
        calculateResult();
    }

    void calculateResult() {
        total = m1 + m2 + m3;
        percentage = total / 3.0;

        if (percentage >= 90) grade = 'A';
        else if (percentage >= 75) grade = 'B';
        else if (percentage >= 50) grade = 'C';
        else grade = 'D';
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Result r = new Result(101, "Mukul Sharma", "AIML", 85, 90, 78);
        r.display();
    }
}
