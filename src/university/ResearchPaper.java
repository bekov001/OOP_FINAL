package university;

import java.util.Date;

public class ResearchPaper {

    private String title;
    private String authors;
    private int pages;
    private Date date;
    private int citations;

    public ResearchPaper() {
    }

    public ResearchPaper(String title, String authors, int pages, Date date, int citations) {
        this.title = title;
        this.authors = authors;
        this.pages = pages;
        this.date = date;
        this.citations = citations;
    }

    public int getCitationCount() {
        return citations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCitations() {
        return citations;
    }

    public void setCitations(int citations) {
        this.citations = citations;
    }
}