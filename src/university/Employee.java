package university;

import java.util.Date;

public abstract class Employee extends User {

    private double salary;
    private Date hireDate;

    public Employee() {
        super();
    }

    public Employee(String id, String firstName, String lastName, String email, String password,
                    double salary, Date hireDate) {
        super(id, firstName, lastName, email, password);
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}