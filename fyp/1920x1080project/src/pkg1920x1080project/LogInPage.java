/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg1920x1080project;
/**
 *
 * @author Sohaib Ali
 */
public class LogInPage extends javax.swing.JFrame {

    /**
     * Creates new form LogInPage
     */
    public LogInPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernamelabel = new javax.swing.JLabel();
        enterusername = new javax.swing.JTextField();
        passwordlabel = new javax.swing.JLabel();
        enterpassword = new javax.swing.JTextField();
        loginbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        signupbtn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        usernamelabel.setText("USERNAME");
        getContentPane().add(usernamelabel);
        usernamelabel.setBounds(110, 260, 80, 30);

        enterusername.setText("jTextField1");
        enterusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterusernameActionPerformed(evt);
            }
        });
        getContentPane().add(enterusername);
        enterusername.setBounds(110, 310, 300, 22);

        passwordlabel.setText("PASSWORD");
        getContentPane().add(passwordlabel);
        passwordlabel.setBounds(110, 380, 70, 30);

        enterpassword.setText("jTextField1");
        getContentPane().add(enterpassword);
        enterpassword.setBounds(110, 430, 300, 22);

        loginbtn.setText("LOG IN");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn);
        loginbtn.setBounds(210, 490, 80, 23);

        jLabel1.setText("----------------NEW USER ?----------------");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 540, 230, 16);

        signupbtn.setText("SIGN UP NOW");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });
        getContentPane().add(signupbtn);
        signupbtn.setBounds(180, 590, 150, 23);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginpage1366x768.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterusernameActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbtnActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField enterpassword;
    private javax.swing.JTextField enterusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JButton signupbtn;
    private javax.swing.JLabel usernamelabel;
    // End of variables declaration//GEN-END:variables
}
