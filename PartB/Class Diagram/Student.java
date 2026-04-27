
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Student extends User implements Researcher {

    /**
     * Default constructor
     */
    public Student() {
    }

    /**
     * 
     */
    private String studentId;

    /**
     * 
     */
    private String major;

    /**
     * 
     */
    private int yearOfStudy;

    /**
     * 
     */
    private double gpa;

    /**
     * 
     */
    private int totalCredits;




    /**
     * @return
     */
    public void viewTranscript() {
        // TODO implement here
        return null;
    }

    /**
     * @param Course c 
     * @return
     */
    public void registerToCourse(void Course c) {
        // TODO implement here
        return null;
    }

    /**
     * @param t 
     * @param score 
     * @return
     */
    public void rateTeacher(Teacher t, int score) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void viewAvailableCourses() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int calculateHIndex() {
        // TODO implement Researcher.calculateHIndex() here
        return 0;
    }

    /**
     * @return
     */
    public void printPapers() {
        // TODO implement Researcher.printPapers() here
        return null;
    }

    /**
     * @param c 
     * @return
     */
    public void printPapers(Comparator<ResearchPaper> c) {
        // TODO implement Researcher.printPapers() here
        return null;
    }

    /**
     * @param s 
     * @return
     */
    public void superviseStudent(Student s) {
        // TODO implement Researcher.superviseStudent() here
        return null;
    }

}