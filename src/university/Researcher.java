package university;

import java.util.Comparator;

public interface Researcher {

    int calculateHIndex();

    void printPapers(Comparator<ResearchPaper> c);
}