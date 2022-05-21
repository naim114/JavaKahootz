package javakahootz;

import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Question {

    final String title;
    final ArrayList<Answer> answer_list;

    Question(JSONObject jsonobject) {
        this.title = (String) jsonobject.get("question_title");

        ArrayList<Answer> answer_list_initialize = new ArrayList<>();

        JSONArray answerJSON = (JSONArray) jsonobject.get("answer");

        for (int i = 0; i < answerJSON.size(); i++) {
            Answer ans = new Answer((JSONObject) answerJSON.get(i));

            answer_list_initialize.add(ans);
        }

        this.answer_list = answer_list_initialize;
    }

    public String toString() {
        return "Question Title: " + this.title + "\nAnswers: " + this.answer_list;
    }
}
