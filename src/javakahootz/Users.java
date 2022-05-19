package javakahootz;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Users {

    final JSONArray users;

    Users() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Reader reader = null;

        try {
            reader = new FileReader("tb_user.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.users = (JSONArray) parser.parse(reader);
    }

    public JSONArray getAllUser() {
        return this.users;
    }

    public int size() {
        return this.users.size();
    }

    public User get(int index) {
        JSONObject userJSON = null;
        for (int i = 0; i < this.users.size(); i++) {
            userJSON = (JSONObject) this.users.get(index);
        }

        User user = new User(userJSON);

        return user;
    }

    public User getUserByUsername(String username) {
        User user = null;
        for (int i = 0; i < this.users.size(); i++) {
            JSONObject userJSON = (JSONObject) this.users.get(i);
            User user_check = new User(userJSON);

            if (username.equals(user_check.username)) {
                user = user_check;
            }
        }

        return user;
    }

    public User getCurrentUser() {
        User current_user = null;

        try {
            JSONParser parser = new JSONParser();
            Reader reader = new FileReader("tb_current_user.txt");
            JSONArray users = (JSONArray) parser.parse(reader);

            // current user
            current_user = new User((JSONObject) users.get(0));

            System.out.println("\nCURRENT USER\n" + current_user.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return current_user;
    }
}
