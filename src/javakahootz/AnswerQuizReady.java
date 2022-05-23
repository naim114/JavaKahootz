/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javakahootz;

/**
 *
 * @author naimm
 */
public class AnswerQuizReady extends javax.swing.JFrame {

    final Quiz quiz;

    /**
     * Creates new form AnswerQuizReady
     */
    public AnswerQuizReady(Quiz quiz) {
        initComponents();
        setLocationRelativeTo(null);

        this.quiz = quiz;
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
        jLabel3 = new javax.swing.JLabel();
        TxtQTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtQCategory = new javax.swing.JTextField();
        BtnPlay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Slab SemiBold", 0, 18)); // NOI18N
        jLabel1.setText("Get Ready...");

        BtnBack.setBackground(new ThemeColors().danger);
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
        TxtQNo.setEnabled(false);
        TxtQNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtQNoKeyTyped(evt);
            }
        });

        jLabel3.setText("Quiz Title :");

        TxtQTitle.setEnabled(false);

        jLabel4.setText("Quiz Category :");

        TxtQCategory.setEnabled(false);

        BtnPlay.setBackground(new ThemeColors().success);
        BtnPlay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnPlay.setForeground(new java.awt.Color(255, 255, 255));
        BtnPlay.setText("PLAY");
        BtnPlay.setToolTipText("Play Quiz");
        BtnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlayActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtQCategory)
                            .addComponent(TxtQNo)
                            .addComponent(TxtQTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBack))
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
                .addGap(18, 18, 18)
                .addComponent(BtnPlay, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        this.dispose();

        new AnswerQuizMenu().setVisible(true);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void TxtQNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtQNoKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) {
            evt.consume();  // if it's not a number, ignore the event
        }
    }//GEN-LAST:event_TxtQNoKeyTyped

    private void BtnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlayActionPerformed
        System.out.println("All Question for this quiz;");

        int score = 0;

        for (int i = 0; i < this.quiz.question_list.size(); i++) {
            Question question = this.quiz.question_list.get(i);

            System.out.println((i + 1) + ". " + question.title);

            AnswerQuestion answer_question = new AnswerQuestion(this, rootPaneCheckingEnabled, i, question);

            boolean question_answered = answer_question.showDialog();

            if (question_answered) {
                score++;
            }
        }

        System.out.println("Score: " + score);
        System.out.println("Percent: " + ((double) score / (double) this.quiz.question_list.size()));

        // save to textfile
        // redirect back to finish answer
        this.dispose();
        new AnswerQuizFinish(score, this.quiz.question_list.size()).setVisible(true);
    }//GEN-LAST:event_BtnPlayActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TxtQNo.setText(String.valueOf(quiz.question_no));
        TxtQCategory.setText(quiz.category);
        TxtQTitle.setText(quiz.title);
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnPlay;
    private javax.swing.JTextField TxtQCategory;
    private javax.swing.JTextField TxtQNo;
    private javax.swing.JTextField TxtQTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
