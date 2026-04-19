package university;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseCode;
    private String courseTitle;
    private int credits;
    private Teacher teacher;
    private List<Lesson> lessons;
    private List<Student> students;

    public Course() {
        this.lessons = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public Course(String courseCode, String courseTitle, int credits, Teacher teacher) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.credits = credits;
        this.teacher = teacher;
        this.lessons = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public int getAvailableSlots() {
        return 0;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}