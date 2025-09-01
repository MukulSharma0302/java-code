import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            Student s = new Student();

            System.out.print("Roll Number: ");
            s.setRollNumber(sc.nextInt());
            sc.nextLine();

            System.out.print("Name: ");
            s.setName(sc.nextLine());

            System.out.print("Course: ");
            s.setCourse(sc.nextLine());

            System.out.print("Marks: ");
            s.setMarks(sc.nextDouble());
            sc.nextLine();

            students[i] = s;
            System.out.println("Student added successfully!\n");
        }

        System.out.println("\n--- Student Records ---");
        for (Student st : students) {
            st.displayStudent();
        }

        sc.close();
    }
}