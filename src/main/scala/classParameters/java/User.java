package classParameters.java;

import java.util.List;

public class User {
    String username;
    String password;
    String email;
    List<Order> orders;

    public User(String username, String password, String email, List<Order> orders) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.orders = orders;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
