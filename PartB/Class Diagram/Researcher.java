
import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Researcher {



    /**
     * @return
     */
    public int calculateHIndex();

    /**
     * @return
     */
    public void printPapers();

    /**
     * @param c 
     * @return
     */
    public void printPapers(Comparator<ResearchPaper> c);

    /**
     * @param s 
     * @return
     */
    public void superviseStudent(Student s);

}