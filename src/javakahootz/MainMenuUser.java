/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javakahootz;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author naimm
 */
public class MainMenuUser extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuUser
     */
    public MainMenuUser() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        BtnCreateQuiz = new javax.swing.JButton();
        BtnAnswerQuiz = new javax.swing.JButton();
        BtnHistory = new javax.swing.JButton();
        BtnLogout = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("JavaKahootz");

        BtnCreateQuiz.setFont(new java.awt.Font("Roboto Slab", 0, 18)); // NOI18N
        BtnCreateQuiz.setText("Create Quiz");
        BtnCreateQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateQuizActionPerformed(evt);
            }
        });

        BtnAnswerQuiz.setFont(new java.awt.Font("Roboto Slab", 0, 18)); // NOI18N
        BtnAnswerQuiz.setText("Answer Quiz");
        BtnAnswerQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnswerQuizActionPerformed(evt);
            }
        });

        BtnHistory.setFont(new java.awt.Font("Roboto Slab", 0, 18)); // NOI18N
        BtnHistory.setText("History");
        BtnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHistoryActionPerformed(evt);
            }
        });

        BtnLogout.setBackground(new ThemeColors().dark);
        BtnLogout.setFont(new java.awt.Font("Roboto Slab", 0, 18)); // NOI18N
        BtnLogout.setForeground(new java.awt.Color(255, 255, 255));
        BtnLogout.setText("Logout");
        BtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogoutActionPerformed(evt);
            }
        });

        BtnExit.setBackground(new ThemeColors().danger);
        BtnExit.setFont(new java.awt.Font("Roboto Slab", 0, 18)); // NOI18N
        BtnExit.setForeground(new java.awt.Color(240, 240, 240));
        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnCreateQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAnswerQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BtnCreateQuiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAnswerQuiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnExit)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCreateQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateQuizActionPerformed
        this.dispose();

        new CreateQuizMenu().setVisible(true);
    }//GEN-LAST:event_BtnCreateQuizActionPerformed

    private void BtnAnswerQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnswerQuizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAnswerQuizActionPerformed

    private void BtnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHistoryActionPerformed

    private void BtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogoutActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?");

        if (reply == JOptionPane.YES_OPTION) {
            // clear current_user text file
            try {
                FileWriter fwOb = new FileWriter("tb_current_user.txt", false);
                PrintWriter pwOb = new PrintWriter(fwOb, false);
                pwOb.flush();
                pwOb.close();
                fwOb.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            // redirect to login
            this.dispose();
            new Login().setVisible(true);
            JOptionPane.showMessageDialog(null, "Thanks for using us :)");
        }
    }//GEN-LAST:event_BtnLogoutActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        exit();
    }//GEN-LAST:event_BtnExitActionPerformed

    private void exit() {
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");

        if (reply == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainMenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainMenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainMenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainMenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainMenuUser().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnswerQuiz;
    private javax.swing.JButton BtnCreateQuiz;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnHistory;
    private javax.swing.JButton BtnLogout;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
