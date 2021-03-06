/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javakahootz;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javakahootz.CreateQuizSettings.generateQuizID;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author naimm
 */
public class EditQuizSettings extends javax.swing.JFrame {

    final Quiz quiz_to_edit;

    /**
     * Creates new form EditQuizSettings
     */
    public EditQuizSettings(Quiz quiz_to_edit) {
        initComponents();
        setLocationRelativeTo(null);

        this.quiz_to_edit = quiz_to_edit;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtQNo = new javax.swing.JTextField();
        TxtQTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtQCategory = new javax.swing.JTextField();
        BtnCreateQuestion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Slab Medium", 0, 14)); // NOI18N
        jLabel1.setText("Quiz Settings");

        BtnBack.setBackground(new ThemeColors().dark);
        BtnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnBack.setForeground(new java.awt.Color(255, 255, 255));
        BtnBack.setText("Back");
        BtnBack.setToolTipText("Back to Main Menu");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Question No. :");

        TxtQNo.setToolTipText("Please enter number only");
        TxtQNo.setAutoscrolls(false);
        TxtQNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtQNoKeyTyped(evt);
            }
        });

        jLabel3.setText("Quiz Title :");

        jLabel4.setText("Quiz Category :");

        BtnCreateQuestion.setBackground(new ThemeColors().primary);
        BtnCreateQuestion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnCreateQuestion.setForeground(new java.awt.Color(255, 255, 255));
        BtnCreateQuestion.setText("Continue");
        BtnCreateQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateQuestionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCreateQuestion))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtQCategory)
                            .addComponent(TxtQNo)
                            .addComponent(TxtQTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBack)
                    .addComponent(BtnCreateQuestion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtQNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtQTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtQCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        try {
            this.dispose();
            new CreateQuizMenu().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(EditQuizSettings.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(EditQuizSettings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnBackActionPerformed

    private void TxtQNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtQNoKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) {
            evt.consume();  // if it's not a number, ignore the event
        }
    }//GEN-LAST:event_TxtQNoKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TxtQNo.setText(String.valueOf(this.quiz_to_edit.question_no));
        TxtQTitle.setText(this.quiz_to_edit.title);
        TxtQCategory.setText(this.quiz_to_edit.category);
    }//GEN-LAST:event_formWindowOpened

    private void BtnCreateQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateQuestionActionPerformed
        String question_no = TxtQNo.getText();
        String title = TxtQTitle.getText();
        String category = TxtQCategory.getText();

        try {
            // check if there is empty field
            if (question_no.equals("") || title.equals("") || category.equals("")) {
                throw new Exception("Please enter all field.");
            }

            // save data to to text file
            // read every quiz
            JSONParser parser = new JSONParser();
            Reader reader = new FileReader("tb_quiz.txt");
            JSONArray all_quiz = (JSONArray) parser.parse(reader);

            // remove quiz that want to edit
            for (int i = 0; i < all_quiz.size(); i++) {
                JSONObject quiz = (JSONObject) all_quiz.get(i);

                if (quiz.get("quiz_id").equals(this.quiz_to_edit.id)) {
                    all_quiz.remove(i);
                }
            }

            // create new quiz
            JSONObject quizJSON = new JSONObject(); //to be added to text file

            quizJSON.put("quiz_id", generateQuizID(title)); //generate id for quiz
            quizJSON.put("quiz_title", title);
            quizJSON.put("quiz_category", category);
            quizJSON.put("question_no", Integer.parseInt(question_no));
            quizJSON.put("username", new Users().getCurrentUser().username);

            System.out.println("Quiz setting done. On to questions...");

            this.setVisible(false);

            JSONArray answerListJSON = new JSONArray();

            for (int i = 0; i < Integer.parseInt(question_no); i++) {
                CreateQuestion q = new CreateQuestion(this, true, i);

                JSONObject answerJSON = q.showDialog();

                answerListJSON.add(answerJSON);
            }

            quizJSON.put("question", answerListJSON);

            System.out.println("Quiz Completed!\n" + quizJSON);

            // save data to to text file
            // clear text file
            FileWriter fwOb = new FileWriter("tb_quiz.txt", false);
            PrintWriter pwOb = new PrintWriter(fwOb, false);
            pwOb.flush();
            pwOb.close();
            fwOb.close();

            // write back all of quizzes with new quiz added
            FileWriter writer = new FileWriter("tb_quiz.txt", true);
            all_quiz.add(quizJSON);
            writer.write(all_quiz.toJSONString());
            writer.close();
            JOptionPane.showMessageDialog(null, "Success Created a Quiz!");

            // redirect back to create quiz menu
            this.dispose();
            new CreateQuizMenu().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BtnCreateQuestionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnCreateQuestion;
    private javax.swing.JTextField TxtQCategory;
    private javax.swing.JTextField TxtQNo;
    private javax.swing.JTextField TxtQTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
