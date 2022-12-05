/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg1920x1080project;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static pkg1920x1080project.LogInPage.LoggedInUsername;

/**
 *
 * @author Sohaib Ali
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() throws SQLException {
        initComponents();
        
        setusername();
        setcurrentpoints();
    }
    
    public void setusername()
    {
        String username = LoggedInUsername;       
        usernamelabel.setText(username);
        
        
    }
    
    public void setcurrentpoints() throws SQLException
    {
        
        System.out.println("In setcurrentpoints");
        String username = LoggedInUsername;  
        
        System.out.println(username);
        
        Connection con;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
        String sql = "Select `scd_db`.`Customer`.`CurrentPoints` from `scd_db`.`Customer` where `scd_db`.`Customer`.`Name` = ?";
        PreparedStatement ps =con.prepareStatement(sql);  
            
        ps.setString(1, username);
            
        ResultSet rs = ps.executeQuery();
        System.out.println("In setcurrentpoints 2");
        rs.next();
        
        String coins = rs.getString("CurrentPoints");
        System.out.println(coins);
        coinslabel.setText(coins);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eventsbtn = new javax.swing.JButton();
        busbtn = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        cartbtn = new javax.swing.JButton();
        reservedbtn = new javax.swing.JButton();
        viewprofilebtn = new javax.swing.JButton();
        usernamelabel = new javax.swing.JLabel();
        coinslabel = new javax.swing.JLabel();
        backgroundlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        eventsbtn.setBorder(null);
        eventsbtn.setBorderPainted(false);
        eventsbtn.setContentAreaFilled(false);
        eventsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventsbtnActionPerformed(evt);
            }
        });
        getContentPane().add(eventsbtn);
        eventsbtn.setBounds(530, 510, 90, 60);

        busbtn.setBorder(null);
        busbtn.setContentAreaFilled(false);
        busbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busbtnActionPerformed(evt);
            }
        });
        getContentPane().add(busbtn);
        busbtn.setBounds(740, 510, 100, 60);

        homebtn.setBorder(null);
        homebtn.setContentAreaFilled(false);
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        getContentPane().add(homebtn);
        homebtn.setBounds(360, 630, 50, 40);

        cartbtn.setBorder(null);
        cartbtn.setContentAreaFilled(false);
        cartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cartbtn);
        cartbtn.setBounds(560, 620, 50, 40);

        reservedbtn.setBorder(null);
        reservedbtn.setContentAreaFilled(false);
        reservedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservedbtnActionPerformed(evt);
            }
        });
        getContentPane().add(reservedbtn);
        reservedbtn.setBounds(740, 630, 50, 40);

        viewprofilebtn.setBorder(null);
        viewprofilebtn.setContentAreaFilled(false);
        viewprofilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewprofilebtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewprofilebtn);
        viewprofilebtn.setBounds(930, 630, 50, 40);

        usernamelabel.setText("jLabel1");
        getContentPane().add(usernamelabel);
        usernamelabel.setBounds(240, 90, 120, 40);

        coinslabel.setText("jLabel1");
        getContentPane().add(coinslabel);
        coinslabel.setBounds(1130, 80, 70, 50);

        backgroundlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homepage1366x768.png"))); // NOI18N
        getContentPane().add(backgroundlabel);
        backgroundlabel.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busbtnActionPerformed
        // TODO add your handling code here:
        busservicespage = new BusServices();
        busservicespage.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_busbtnActionPerformed

    private void eventsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventsbtnActionPerformed
        try {
            // TODO add your handling code here:
            eventspage = new EventsPage();
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        eventspage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_eventsbtnActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
        //do nothing as already on homepage
    }//GEN-LAST:event_homebtnActionPerformed

    private void cartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartbtnActionPerformed

    private void reservedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservedbtnActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        ReservationsPage RP = new ReservationsPage();
        RP.setVisible(true);
    }//GEN-LAST:event_reservedbtnActionPerformed

    private void viewprofilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewprofilebtnActionPerformed
        try {
            // TODO add your handling code here:
            viewprofilepage = new ViewProfile();
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        viewprofilepage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewprofilebtnActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HomePage().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
    private ViewProfile viewprofilepage;
    private BusServices busservicespage;
    private EventsPage eventspage;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundlabel;
    private javax.swing.JButton busbtn;
    private javax.swing.JButton cartbtn;
    private javax.swing.JLabel coinslabel;
    private javax.swing.JButton eventsbtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JButton reservedbtn;
    private javax.swing.JLabel usernamelabel;
    private javax.swing.JButton viewprofilebtn;
    // End of variables declaration//GEN-END:variables
}
