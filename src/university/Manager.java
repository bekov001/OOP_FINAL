package university;

import java.util.Date;

public class Manager extends Employee {

    private ManagerType type;

    public Manager() {
        super();
    }

    public Manager(String id, String firstName, String lastName, String email, String password,
                   double salary, Date hireDate, ManagerType type) {
        super(id, firstName, lastName, email, password, salary, hireDate);
        this.type = type;
    }

    public void addCourseForRegistration() {
    }

    public void generateStatisticalReport() {
    }

    public ManagerType getType() {
        return type;
    }

    public void setType(ManagerType type) {
        this.type = type;
    }
}