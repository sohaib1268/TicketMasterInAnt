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
public class BusServices extends javax.swing.JFrame {

    /**
     * Creates new form BusServices
     */
    public BusServices() {
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

        searchbar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        busservicestable = new javax.swing.JTable();
        homebtn = new javax.swing.JButton();
        eventsbtn = new javax.swing.JButton();
        busservicesbtn = new javax.swing.JButton();
        cartbtn = new javax.swing.JButton();
        reservedbtn = new javax.swing.JButton();
        viewdetailsbtn = new javax.swing.JButton();
        backgroundlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        searchbar.setText("SEARCH");
        getContentPane().add(searchbar);
        searchbar.setBounds(140, 210, 350, 22);

        busservicestable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bus Service Name", "FROM CITY", "TO CITY", "TIME"
            }
        ));
        jScrollPane2.setViewportView(busservicestable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(140, 330, 1060, 340);

        homebtn.setContentAreaFilled(false);
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        getContentPane().add(homebtn);
        homebtn.setBounds(20, 130, 50, 50);

        eventsbtn.setContentAreaFilled(false);
        eventsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventsbtnActionPerformed(evt);
            }
        });
        getContentPane().add(eventsbtn);
        eventsbtn.setBounds(20, 233, 50, 50);

        busservicesbtn.setContentAreaFilled(false);
        busservicesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busservicesbtnActionPerformed(evt);
            }
        });
        getContentPane().add(busservicesbtn);
        busservicesbtn.setBounds(25, 343, 40, 70);

        cartbtn.setContentAreaFilled(false);
        cartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cartbtn);
        cartbtn.setBounds(22, 453, 50, 60);

        reservedbtn.setContentAreaFilled(false);
        reservedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservedbtnActionPerformed(evt);
            }
        });
        getContentPane().add(reservedbtn);
        reservedbtn.setBounds(20, 560, 50, 60);

        viewdetailsbtn.setText("VIEW DETAILS");
        viewdetailsbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        viewdetailsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewdetailsbtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewdetailsbtn);
        viewdetailsbtn.setBounds(960, 160, 130, 70);

        backgroundlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BUS SERVICES1366X768.png"))); // NOI18N
        getContentPane().add(backgroundlabel);
        backgroundlabel.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        try {
            // TODO add your handling code here:
            homepage = new HomePage();
        } catch (SQLException ex) {
            Logger.getLogger(BusServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        homepage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homebtnActionPerformed

    private void eventsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventsbtnActionPerformed
        try {
            // TODO add your handling code here:
            eventspage = new EventsPage();
        } catch (SQLException ex) {
            Logger.getLogger(BusServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        eventspage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_eventsbtnActionPerformed

    private void busservicesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busservicesbtnActionPerformed
        // TODO add your handling code here:
        //do nothing as already on the same page
    }//GEN-LAST:event_busservicesbtnActionPerformed

    private void cartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartbtnActionPerformed

    private void reservedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservedbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservedbtnActionPerformed

    private void viewdetailsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewdetailsbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewdetailsbtnActionPerformed

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
            java.util.logging.Logger.getLogger(BusServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusServices().setVisible(true);
            }
        });
    }

    
    
    
    private HomePage homepage;
    private EventsPage eventspage;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundlabel;
    private javax.swing.JButton busservicesbtn;
    private javax.swing.JTable busservicestable;
    private javax.swing.JButton cartbtn;
    private javax.swing.JButton eventsbtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reservedbtn;
    private javax.swing.JTextField searchbar;
    private javax.swing.JButton viewdetailsbtn;
    // End of variables declaration//GEN-END:variables
}
