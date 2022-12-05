/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg1920x1080project;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sohaib Ali
 */
public class ViewProfile extends javax.swing.JFrame {

    /**
     * Creates new form ViewProfile
     */
    public ViewProfile() {
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

        homebtn = new javax.swing.JButton();
        eventsbtn = new javax.swing.JButton();
        busbtn = new javax.swing.JButton();
        cartbtn = new javax.swing.JButton();
        reservedbtn = new javax.swing.JButton();
        namelabel = new javax.swing.JLabel();
        emaillabel = new javax.swing.JLabel();
        contactlabel = new javax.swing.JLabel();
        passwordlabel = new javax.swing.JLabel();
        citylabel = new javax.swing.JLabel();
        displayname = new javax.swing.JLabel();
        displayemail = new javax.swing.JLabel();
        displaycontact = new javax.swing.JLabel();
        displaypassword = new javax.swing.JLabel();
        displaycity = new javax.swing.JLabel();
        editprofilebtn = new javax.swing.JButton();
        backgroundlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        homebtn.setBorder(null);
        homebtn.setContentAreaFilled(false);
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        getContentPane().add(homebtn);
        homebtn.setBounds(20, 120, 50, 60);

        eventsbtn.setBorder(null);
        eventsbtn.setContentAreaFilled(false);
        eventsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventsbtnActionPerformed(evt);
            }
        });
        getContentPane().add(eventsbtn);
        eventsbtn.setBounds(20, 240, 50, 50);

        busbtn.setBorder(null);
        busbtn.setContentAreaFilled(false);
        busbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busbtnActionPerformed(evt);
            }
        });
        getContentPane().add(busbtn);
        busbtn.setBounds(20, 350, 50, 50);

        cartbtn.setBorder(null);
        cartbtn.setContentAreaFilled(false);
        cartbtn.setDefaultCapable(false);
        cartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cartbtn);
        cartbtn.setBounds(20, 460, 50, 40);

        reservedbtn.setBorder(null);
        reservedbtn.setContentAreaFilled(false);
        reservedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservedbtnActionPerformed(evt);
            }
        });
        getContentPane().add(reservedbtn);
        reservedbtn.setBounds(20, 560, 50, 50);

        namelabel.setText("NAME :");
        getContentPane().add(namelabel);
        namelabel.setBounds(160, 360, 60, 15);

        emaillabel.setText("EMAIL : ");
        getContentPane().add(emaillabel);
        emaillabel.setBounds(160, 410, 60, 15);

        contactlabel.setText("CONTACT :");
        getContentPane().add(contactlabel);
        contactlabel.setBounds(160, 460, 70, 15);

        passwordlabel.setText("PASSWORD :");
        getContentPane().add(passwordlabel);
        passwordlabel.setBounds(160, 510, 90, 15);

        citylabel.setText("CITY :");
        getContentPane().add(citylabel);
        citylabel.setBounds(160, 560, 70, 15);

        displayname.setText("jLabel1");
        getContentPane().add(displayname);
        displayname.setBounds(270, 360, 200, 15);

        displayemail.setText("jLabel2");
        getContentPane().add(displayemail);
        displayemail.setBounds(270, 410, 200, 15);

        displaycontact.setText("jLabel3");
        getContentPane().add(displaycontact);
        displaycontact.setBounds(270, 460, 220, 15);

        displaypassword.setText("jLabel4");
        getContentPane().add(displaypassword);
        displaypassword.setBounds(270, 510, 200, 15);

        displaycity.setText("jLabel5");
        getContentPane().add(displaycity);
        displaycity.setBounds(270, 560, 180, 15);

        editprofilebtn.setText("EDIT PROFILE");
        editprofilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editprofilebtnActionPerformed(evt);
            }
        });
        getContentPane().add(editprofilebtn);
        editprofilebtn.setBounds(210, 240, 190, 25);

        backgroundlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MY PROFILE1366X768.png"))); // NOI18N
        getContentPane().add(backgroundlabel);
        backgroundlabel.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        try {
            // TODO add your handling code here:
            homepage = new HomePage();
        } catch (SQLException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        homepage.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_homebtnActionPerformed

    private void eventsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventsbtnActionPerformed
        try {
            // TODO add your handling code here:
            eventspage = new EventsPage();
        } catch (SQLException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        eventspage.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_eventsbtnActionPerformed

    private void busbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busbtnActionPerformed
        // TODO add your handling code here:
        buspage = new BusServices();
        buspage.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_busbtnActionPerformed

    private void cartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartbtnActionPerformed

    private void reservedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservedbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservedbtnActionPerformed

    private void editprofilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editprofilebtnActionPerformed
        // TODO add your handling code here:
        editprofile = new editprofilepage();
        editprofile.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_editprofilebtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProfile().setVisible(true);
            }
        });
    }
    
    private HomePage homepage;
    private BusServices buspage;
    private EventsPage eventspage;
    private editprofilepage editprofile;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundlabel;
    private javax.swing.JButton busbtn;
    private javax.swing.JButton cartbtn;
    private javax.swing.JLabel citylabel;
    private javax.swing.JLabel contactlabel;
    private javax.swing.JLabel displaycity;
    private javax.swing.JLabel displaycontact;
    private javax.swing.JLabel displayemail;
    private javax.swing.JLabel displayname;
    private javax.swing.JLabel displaypassword;
    private javax.swing.JButton editprofilebtn;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JButton eventsbtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel namelabel;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JButton reservedbtn;
    // End of variables declaration//GEN-END:variables
}
