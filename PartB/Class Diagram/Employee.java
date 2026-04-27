
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Employee extends User implements Researcher {

    /**
     * Default constructor
     */
    public Employee() {
    }

    /**
     * 
     */
    private double salary;

    /**
     * 
     */
    private Date hireDate;

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