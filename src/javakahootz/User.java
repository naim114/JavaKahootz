package javakahootz;

import org.json.simple.JSONObject;

public class User {

    final String username;
    final String password;

    User(JSONObject jsonobject) {
        this.username = (String) jsonobject.get("username");
        this.password = (String) jsonobject.get("password");
    }

    public String toString() {
        return "Username: " + this.username + "\nPassword: " + this.password;
    }
}
