package wrx.rb.demo.bean;


public class SecurityUserBean {

    public static enum Roles {
        admin, normal;
        @Override
        public String toString() {
            return this.name();
        }
    }

    private Integer id;

    private String username;

    private String password;

    private Roles role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
