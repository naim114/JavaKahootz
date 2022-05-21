package javakahootz;

import org.json.simple.JSONObject;

public class Answer {

    final String title;
    final boolean is_correct;

    Answer(JSONObject jsonobject) {
        this.title = (String) jsonobject.get("answer_title");
        this.is_correct = (boolean) jsonobject.get("is_correct");
    }

    public String toString() {
        return "Answer: " + this.title + "\nCorrect: " + this.is_correct;
    }
}
