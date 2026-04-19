package university;

import java.util.Comparator;

public class Teacher extends Employee implements Researcher {

    private TeacherTitle title;

    public Teacher() {
        super();
    }

    public TeacherTitle getTitle() {
        return title;
    }

    public void setTitle(TeacherTitle title) {
        this.title = title;
    }

    public void putMark(Student s, Course c, int score) {
    }

    public void viewStudents() {
    }

    @Override
    public int calculateHIndex() {
        return 0;
    }

    @Override
    public void printPapers(Comparator<ResearchPaper> c) {
    }
}