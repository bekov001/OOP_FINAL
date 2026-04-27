
import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Manager extends Employee {

    /**
     * Default constructor
     */
    public Manager() {
    }

    /**
     * 
     */
    private ManagerType type;

    /**
     * @param c 
     * @return
     */
    public void addCourseForRegistration(Course c) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String generateStatisticalReport() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public void viewRequests() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void manageNews() {
        // TODO implement here
        return null;
    }

    /**
     * @param s 
     * @return
     */
    public void approveRegistration(Student s) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void viewStudentsByGPA() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void viewTeachersByTitle() {
        // TODO implement here
        return null;
    }

}