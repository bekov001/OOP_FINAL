package university;

public abstract class User {

    protected String id;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;

    public boolean login() {
        return false;
    }

    public void logout() {
    }
}