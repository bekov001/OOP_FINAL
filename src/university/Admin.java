package university;


import java.util.List;

public class Admin extends User {

    private List<User> users;

    public Admin() {
        super();
        this.users = new ArrayList<>();
    }

    public Admin(String id, String firstName, String lastName, String email, String password) {
        super(id, firstName, lastName, email, password);
        this.users = new ArrayList<>();
    }

    public void addUser(User u) {
    }

    public void removeUser(User u) {
    }

    public void updateUser(User u) {
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}