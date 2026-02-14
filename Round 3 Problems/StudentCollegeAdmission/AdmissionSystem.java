package StudentCollegeAdmission;

import java.time.LocalDate;
import java.util.Scanner;

public class AdmissionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== Student Admission System (SyncCET) ===");
            System.out.println("1. Student Registration");
            System.out.println("2. Student Login");
            System.out.println("3. Department-wise Seat Availability");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> registerStudent(sc);
                case 2 -> studentLogin(sc);
                case 3 -> showDepartmentSeats();
                case 4 -> {
                    System.out.println("Thank you! Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice, try again!");
            }
        }
    }

    // ------------------- OPTION 1 -------------------
    private static void registerStudent(Scanner sc) {
        System.out.println("\n=== Student Registration ===");
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Father Name: ");
        String fatherName = sc.nextLine();

        System.out.print("Enter DOB (yyyy-MM-dd): ");
        LocalDate dob = LocalDate.parse(sc.nextLine());

        System.out.print("Enter Gender (MALE/FEMALE/TRANSGENDER): ");
-        Gender gender = Gender.valueOf(sc.nextLine());

        System.out.print("Enter Email ID: ");
        String email = sc.nextLine();

        System.out.print("Enter Physics Mark: ");
        int phy = sc.nextInt();

        System.out.print("Enter Chemistry Mark: ");
        int chem = sc.nextInt();

        System.out.print("Enter Maths Mark: ");
        int math = sc.nextInt();
        sc.nextLine(); 

        String id = IdGenerator.nextStudentId();
        Student s = new Student(id, name, fatherName, dob, gender, email, phy, chem, math);
        StudentsLogin.add(s);

        System.out.println("\nStudent Registered Successfully!");
        System.out.println("Student ID is " + id);
    }

    // ------------------- OPTION 2 -------------------
    private static void studentLogin(Scanner sc) {
        System.out.print("\nEnter Student ID: ");
        String id = sc.nextLine().trim().toUpperCase();
        Student s = StudentsLogin.findById(id);

        if (s == null) {
            System.out.println("❌ Invalid Student ID!");
            return;
        }

        System.out.println("\nLogin Successful ✅");
        System.out.println("Welcome, " + s.studentName + "!");
        studentSubMenu(sc, s);
    }

    private static void studentSubMenu(Scanner sc, Student s) {
        int opt;
        do {
            System.out.println("\n=== Student Sub Menu ===");
            System.out.println("1. Check Eligibility");
            System.out.println("2. Show Details");
            System.out.println("3. Logout");
            System.out.print("Enter choice: ");
            opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1 -> checkEligibility(s);
                case 2 -> showStudentDetails(s);
                case 3 -> System.out.println("Logging out...");
                default -> System.out.println("Invalid choice!");
            }
        } while (opt != 3);
    }

    // ------------------- ELIGIBILITY -------------------
    private static void checkEligibility(Student s) {
        double avg = s.getAverage();
        System.out.println("Average Marks: " + String.format("%.2f", avg));
        if (avg >= 50)
            System.out.println("3Eligible for Admission");
        else
            System.out.println(" Not Eligible for Admission");
    }

    // ------------------- SHOW DETAILS -------------------
    private static void showStudentDetails(Student s) {
        System.out.println("\n=== Student Details ===");
        System.out.println("Student ID   : " + s.studentId);
        System.out.println("Name         : " + s.studentName);
        System.out.println("Father Name  : " + s.fatherName);
        System.out.println("Date of Birth: " + s.dob);
        System.out.println("Gender       : " + s.gender);
        System.out.println("Email ID     : " + s.emailId);
        System.out.println("Physics      : " + s.physics);
        System.out.println("Chemistry    : " + s.chemistry);
        System.out.println("Maths        : " + s.maths);
    }

    // ------------------- OPTION 3 -------------------
    private static void showDepartmentSeats() {
        System.out.println("\n=== Department-wise Seat Availability ===");
        System.out.println("CSE - 50 seats");
        System.out.println("ECE - 45 seats");
        System.out.println("MECH - 40 seats");
        System.out.println("EEE - 35 seats");
    }
}
