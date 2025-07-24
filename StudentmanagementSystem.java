import java.util.*;

public class StudentmanagementSystem {
    List<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        sc.nextLine(); // clear buffer
        students.add(new Student(name, rollNo, marks));
    }

    public void displayStudents() {
    System.out.println("\n--- Student Records ---");
    
    System.out.printf("%-10s %-10s %-15s %-10s\n", "Roll No", "Name", "Average Marks", "Grade");
    System.out.println("----------------------------------------------------------");

    for (Student s : students) {
        System.out.printf("%-10d %-10s %-15.2f %-10c\n", s.rollno, s.name, s.Avg, s.Grade);
    }
}


    public static void main(String[] args) {
        StudentmanagementSystem sms = new StudentmanagementSystem();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Student\n2. Display Students\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: sms.addStudent(); break;
                case 2: sms.displayStudents(); break;
                case 3: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
        
    }
}
