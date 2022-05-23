package javakahootz;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ScoreHistory {

    final String id;
    final User user;
    final Quiz quiz;
    final int score;
    final int question_list;

    ScoreHistory(JSONObject jsonobject) throws IOException, ParseException {
        this.id = (String) jsonobject.get("id");

        Long scoreLong = (Long) jsonobject.get("score");
        this.score = scoreLong.intValue();

        Long questionLong = (Long) jsonobject.get("question_list");
        this.question_list = questionLong.intValue();

        String username = (String) jsonobject.get("user");
        this.user = new Users().getUserByUsername(username);

        String quiz_id = (String) jsonobject.get("quiz");

        // read every quiz
        JSONParser parser = new JSONParser();
        Reader reader = new FileReader("tb_quiz.txt");
        JSONArray allQuizJSON = (JSONArray) parser.parse(reader);

        Quiz quiz_initialize = null;

        for (int i = 0; i < allQuizJSON.size(); i++) {
            Quiz q = new Quiz((JSONObject) allQuizJSON.get(i));

            if (q.id.equals(quiz_id)) {
                quiz_initialize = q;
            }
        }

        this.quiz = quiz_initialize;
    }
}
