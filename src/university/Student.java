package university;

import java.util.Comparator;

public class Student extends User implements Researcher {

    protected String major;
    protected int year;
    protected double gpa;
    protected int totalCredits;

    public void registerForCourse(Course c) {
    }

    public void viewTranscript() {
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