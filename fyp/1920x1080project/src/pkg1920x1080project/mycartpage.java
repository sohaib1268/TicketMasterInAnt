/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg1920x1080project;

/**
 *
 * @author Sohaib Ali
 */
public class mycartpage extends javax.swing.JFrame {

    /**
     * Creates new form mycartpage
     */
    public mycartpage() {
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
        currentitemslabel = new javax.swing.JLabel();
        itemamountlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartitemstable = new javax.swing.JTable();
        reservebtn = new javax.swing.JButton();
        deleteitembtn = new javax.swing.JButton();
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
        homebtn.setBounds(10, 123, 60, 70);

        eventsbtn.setBorder(null);
        eventsbtn.setContentAreaFilled(false);
        eventsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventsbtnActionPerformed(evt);
            }
        });
        getContentPane().add(eventsbtn);
        eventsbtn.setBounds(10, 233, 60, 60);

        busbtn.setBorder(null);
        busbtn.setContentAreaFilled(false);
        busbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busbtnActionPerformed(evt);
            }
        });
        getContentPane().add(busbtn);
        busbtn.setBounds(10, 343, 60, 60);

        cartbtn.setBorder(null);
        cartbtn.setContentAreaFilled(false);
        cartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cartbtn);
        cartbtn.setBounds(10, 453, 60, 60);

        reservedbtn.setBorder(null);
        reservedbtn.setContentAreaFilled(false);
        reservedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservedbtnActionPerformed(evt);
            }
        });
        getContentPane().add(reservedbtn);
        reservedbtn.setBounds(10, 563, 60, 60);

        currentitemslabel.setText("CURRENT ITEMS :");
        getContentPane().add(currentitemslabel);
        currentitemslabel.setBounds(110, 270, 100, 40);

        itemamountlabel.setText("ITEM AMOUNT LABEL");
        getContentPane().add(itemamountlabel);
        itemamountlabel.setBounds(250, 280, 130, 20);

        cartitemstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(cartitemstable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 340, 950, 350);

        reservebtn.setText("Reserve All");
        reservebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservebtnActionPerformed(evt);
            }
        });
        getContentPane().add(reservebtn);
        reservebtn.setBounds(900, 160, 120, 40);

        deleteitembtn.setText("Delete item");
        deleteitembtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteitembtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteitembtn);
        deleteitembtn.setBounds(900, 240, 120, 40);

        backgroundlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MYCART1366X768.png"))); // NOI18N
        getContentPane().add(backgroundlabel);
        backgroundlabel.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homebtnActionPerformed

    private void eventsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventsbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventsbtnActionPerformed

    private void busbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busbtnActionPerformed

    private void cartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartbtnActionPerformed

    private void reservedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservedbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservedbtnActionPerformed

    private void deleteitembtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteitembtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteitembtnActionPerformed

    private void reservebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservebtnActionPerformed

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
            java.util.logging.Logger.getLogger(mycartpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mycartpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mycartpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mycartpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mycartpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundlabel;
    private javax.swing.JButton busbtn;
    private javax.swing.JButton cartbtn;
    private javax.swing.JTable cartitemstable;
    private javax.swing.JLabel currentitemslabel;
    private javax.swing.JButton deleteitembtn;
    private javax.swing.JButton eventsbtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel itemamountlabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reservebtn;
    private javax.swing.JButton reservedbtn;
    // End of variables declaration//GEN-END:variables
}
