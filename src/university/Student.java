package university;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student extends User implements Researcher {

    private String studentId;
    private String major;
    private int yearOfStudy;
    private double gpa;
    private int totalCredits;
    private List<Course> courses;
    private List<Mark> marks;

    public Student() {
        super();
        this.courses = new ArrayList<>();
        this.marks = new ArrayList<>();
    }

    public Student(String id, String firstName, String lastName, String email, String password,
                   String studentId, String major, int yearOfStudy, double gpa, int totalCredits) {
        super(id, firstName, lastName, email, password);
        this.studentId = studentId;
        this.major = major;
        this.yearOfStudy = yearOfStudy;
        this.gpa = gpa;
        this.totalCredits = totalCredits;
        this.courses = new ArrayList<>();
        this.marks = new ArrayList<>();
    }

    public void registerToCourse(Course c) {
    }

    public void viewTranscript() {
    }

    @Override
    public int calculateHIndex() {
        return 0;
    }

    @Override
    public void printPapers(Comparator<ResearchPaper> c) {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }
}