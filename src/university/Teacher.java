package university;

import java.util.Comparator;

public class Teacher extends Employee implements Researcher {

    protected TeacherTitle title;

    public void putMark(Student s, Course c, int score) {
    }

    public void viewStudents() {
    }

    @Override
    public int calculateHIndex() {
        return 0;
    }

    @Override
    public void printPapers() {
    }

    @Override
    public void PrintPapers(Comparator c) {
    }
}