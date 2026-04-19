package university;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        seedUsers();
        run();
    }

    private static void run() {
        boolean running = true;

        while (running) {
            System.out.println("\nUniversity System:");
            System.out.println("1. Login");
            System.out.println("2. Show demo accounts");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    loginMenu();
                    break;
                case "2":
                    showDemoAccounts();
                    break;
                case "0":
                    running = false;
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void loginMenu() {
        System.out.println("\nAuthorization: ");
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = authenticate(email, password);

        if (user == null) {
            System.out.println("Invalid email or password");
            return;
        }

        System.out.println("\nLogin successful!");
        System.out.println("Welcome, " + user.firstName + " " + user.lastName);
        System.out.println("Role: " + getRole(user));

        userMenu(user);
    }

    private static User authenticate(String email, String password) {
        for (User user : users) {
            if (user.email.equals(email) && user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }

    private static void userMenu(User user) {
        boolean loggedIn = true;

        while (loggedIn) {
            System.out.println("\n User Menu:");
            System.out.println("1. View profile");
            System.out.println("2. Logout");
            System.out.print("Choose option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    showProfile(user);
                    break;
                case "2":
                    loggedIn = false;
                    System.out.println("Logged out successfully.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void showProfile(User user) {
        System.out.println("\nProfile: ");
        System.out.println("ID: " + user.id);
        System.out.println("Name: " + user.firstName + " " + user.lastName);
        System.out.println("Email: " + user.email);
        System.out.println("Role: " + getRole(user));

        if (user instanceof Student) {
            Student s = (Student) user;
            System.out.println("Major: " + s.major);
            System.out.println("Year: " + s.year);
            System.out.println("GPA: " + s.gpa);
            System.out.println("Total credits: " + s.totalCredits);
        } else if (user instanceof Teacher) {
            Teacher t = (Teacher) user;
            System.out.println("Teacher title: " + t.title);
            System.out.println("Salary: " + t.salary);
        } else if (user instanceof Manager) {
            Manager m = (Manager) user;
            System.out.println("Manager type: " + m.type);
            System.out.println("Salary: " + m.salary);
        } else if (user instanceof Employee) {
            Employee e = (Employee) user;
            System.out.println("Salary: " + e.salary);
        }
    }

    private static String getRole(User user) {
        if (user instanceof Admin) return "Admin";
        if (user instanceof Manager) return "Manager";
        if (user instanceof Teacher) return "Teacher";
        if (user instanceof Student) return "Student";
        if (user instanceof Employee) return "Employee";
        return "User";
    }

    private static void showDemoAccounts() {
        System.out.println("\nDemo Accounts:");
        for (User user : users) {
            System.out.println(getRole(user) + ": " + user.email + " / " + user.password);
        }
    }

    private static void seedUsers() {
        Admin admin = new Admin();
        admin.id = "A001";
        admin.firstName = "Admin";
        admin.lastName = "One";
        admin.email = "admin@uni.kz";
        admin.password = "admin123";

        Manager manager = new Manager();
        manager.id = "M001";
        manager.firstName = "Miras";
        manager.lastName = "Manager";
        manager.email = "manager@uni.kz";
        manager.password = "manager123";
        manager.salary = 350000;
        manager.type = ManagerType.OR;

        Teacher teacher = new Teacher();
        teacher.id = "T001";
        teacher.firstName = "Aruzhan";
        teacher.lastName = "Teacher";
        teacher.email = "teacher@uni.kz";
        teacher.password = "teacher123";
        teacher.salary = 400000;
        teacher.title = TeacherTitle.PROFESSOR;

        Student student = new Student();
        student.id = "S001";
        student.firstName = "Aliya";
        student.lastName = "Student";
        student.email = "student@uni.kz";
        student.password = "student123";
        student.major = "Computer Science";
        student.year = 2;
        student.gpa = 3.5;
        student.totalCredits = 18;

        users.add(admin);
        users.add(manager);
        users.add(teacher);
        users.add(student);
    }
}