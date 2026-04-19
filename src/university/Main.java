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
        System.out.println("\nAuthorization:");
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = authenticate(email, password);

        if (user == null) {
            System.out.println("Invalid email or password.");
            return;
        }

        System.out.println("\nLogin successful!");
        System.out.println("Welcome, " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Role: " + getRole(user));

        userMenu(user);
    }

    private static User authenticate(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    private static void userMenu(User user) {
        boolean loggedIn = true;

        while (loggedIn) {
            System.out.println("\nUser Menu:");
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
        System.out.println("\nProfile:");
        System.out.println("ID: " + user.getId());
        System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Role: " + getRole(user));

        if (user instanceof Student) {
            Student s = (Student) user;
            System.out.println("Student ID: " + s.getStudentId());
            System.out.println("Major: " + s.getMajor());
            System.out.println("Year: " + s.getYearOfStudy());
            System.out.println("GPA: " + s.getGpa());
            System.out.println("Total credits: " + s.getTotalCredits());
        } else if (user instanceof Teacher) {
            Teacher t = (Teacher) user;
            System.out.println("Teacher title: " + t.getTitle());
            System.out.println("Salary: " + t.getSalary());
        } else if (user instanceof Manager) {
            Manager m = (Manager) user;
            System.out.println("Manager type: " + m.getType());
            System.out.println("Salary: " + m.getSalary());
        } else if (user instanceof Employee) {
            Employee e = (Employee) user;
            System.out.println("Salary: " + e.getSalary());
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
            System.out.println(getRole(user) + ": " + user.getEmail() + " / " + user.getPassword());
        }
    }

    private static void seedUsers() {
        Admin admin = new Admin();
        admin.setId("A001");
        admin.setFirstName("Admin");
        admin.setLastName("One");
        admin.setEmail("admin@uni.kz");
        admin.setPassword("admin123");

        Manager manager = new Manager();
        manager.setId("M001");
        manager.setFirstName("Miras");
        manager.setLastName("Manager");
        manager.setEmail("manager@uni.kz");
        manager.setPassword("manager123");
        manager.setSalary(350000);
        manager.setType(ManagerType.OR);

        Teacher teacher = new Teacher();
        teacher.setId("T001");
        teacher.setFirstName("Aruzhan");
        teacher.setLastName("Teacher");
        teacher.setEmail("teacher@uni.kz");
        teacher.setPassword("teacher123");
        teacher.setSalary(400000);
        teacher.setTitle(TeacherTitle.PROFESSOR);

        Student student = new Student();
        student.setId("S001");
        student.setFirstName("Aliya");
        student.setLastName("Student");
        student.setEmail("student@uni.kz");
        student.setPassword("student123");
        student.setStudentId("ST001");
        student.setMajor("Computer Science");
        student.setYearOfStudy(2);
        student.setGpa(3.5);
        student.setTotalCredits(18);

        users.add(admin);
        users.add(manager);
        users.add(teacher);
        users.add(student);
    }
}