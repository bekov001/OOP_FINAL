package university;

import java.util.Date;

public class ResearchPaper {

    protected String title;
    protected String authors;
    protected int pages;
    protected Date datePublished;
    protected int citations;

    public int getCitationCount() {
        return 0;
    }
}