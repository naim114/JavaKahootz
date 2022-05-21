package javakahootz;

import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class Quiz {

    final String id;
    final String title;
    final String category;
    final int question_no;
    final User user;
    final ArrayList<Question> question_list;

    Quiz(JSONObject jsonobject) throws IOException, ParseException {
        this.id = (String) jsonobject.get("quiz_id");
        this.title = (String) jsonobject.get("quiz_title");
        this.category = (String) jsonobject.get("quiz_category");

        Long qNo = (Long) jsonobject.get("question_no");
        this.question_no = qNo.intValue();

        String username = (String) jsonobject.get("username");
        Users users = new Users();
        this.user = users.getUserByUsername(username);

        JSONArray questionJSON = (JSONArray) jsonobject.get("question");

        ArrayList<Question> question_list_initialize = new ArrayList<>();

        for (int i = 0; i < questionJSON.size(); i++) {
            Question q = new Question((JSONObject) questionJSON.get(i));

            question_list_initialize.add(q);
        }

        this.question_list = question_list_initialize;
    }

    public void printQuiz() {
        System.out.println("Quiz Title: " + this.title);
        System.out.println("Category: " + this.category);
        System.out.println("ID: " + this.id);
        System.out.println("Question No.: " + this.question_no);

        System.out.println("\nCreated by: " + this.user.username);

        System.out.println("\nQuestion; ");

        for (int i = 0; i < this.question_list.size(); i++) {
            Question question = this.question_list.get(i);

            System.out.println((i + 1) + ". " + question.title);
            for (int j = 0; j < question.answer_list.size(); j++) {
                Answer answer = question.answer_list.get(j);
                System.out.println("- " + answer.title + " (" + answer.is_correct + ")");
            }
            System.out.println();
        }
    }

    public String toString() {
        return "\nQUESTION\nQuiz ID: " + this.id + " \nTitle: " + this.title + "\nCategory: " + this.category + "\nQuestion No. : " + this.question_no + "\nUser: " + this.user.username + "\nQuestion: " + this.question_list;
    }

    public Question getQuestion(int index) {
        return this.question_list.get(index);
    }
}
