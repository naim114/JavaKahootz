package javakahootz;

import org.json.simple.JSONObject;

public class User {

    final String username;
    final String password;
    final boolean delete_flag;

    User(JSONObject jsonobject) {
        this.username = (String) jsonobject.get("username");
        this.password = (String) jsonobject.get("password");
        this.delete_flag = (boolean) jsonobject.get("delete_flag");
    }

    public String toString() {
        return "Username: " + this.username + "\nPassword: " + this.password + "\nDelete Flag: " + this.delete_flag;
    }
}
