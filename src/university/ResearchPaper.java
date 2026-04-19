package university;

import java.time.LocalDate;
import java.util.List;

public class ResearchPaper {

    private String title;
    private List<String> authors;
    private int pages;
    private LocalDate datePublished;
    private int citations;

    public ResearchPaper() {
    }

    public ResearchPaper(String title, List<String> authors, int pages,
                         LocalDate datePublished, int citations) {
        this.title = title;
        this.authors = authors;
        this.pages = pages;
        this.datePublished = datePublished;
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

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
    }

    public int getCitations() {
        return citations;
    }

    public void setCitations(int citations) {
        this.citations = citations;
    }
}