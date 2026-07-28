
class User {

    private String password;

    // Setter (to set password)
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter (to get password)
    public String getPassword() {
        return password;
    }
}

public class Get_set {
    public static void main(String[] args) {

        User u = new User();

        // Set password
        u.setPassword("Prathmesh@123");

        // Get password
        System.out.println(u.getPassword());
    }
}