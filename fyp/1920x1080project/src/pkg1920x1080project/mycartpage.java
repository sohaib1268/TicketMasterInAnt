/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg1920x1080project;

import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static pkg1920x1080project.BusServices.SelectedBusService;
import static pkg1920x1080project.EventsPage.SelectedEvent;
import static pkg1920x1080project.LogInPage.LoggedInUsername;

/**
 *
 * @author Sohaib Ali
 */
public class mycartpage extends javax.swing.JFrame {

    /**
     * Creates new form mycartpage
     */
    public mycartpage() throws SQLException {
        initComponents();
        
        populate();
    }
    
    private String getEventID()
    {
             try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
                String sql = "Select `scd_db`.`Event`.`EventID` from `scd_db`.`Event` where `scd_db`.`Event`.`Name` = ?";  
                PreparedStatement ps =con.prepareStatement(sql);
                
                String name = SelectedEvent;
                ps.setString(1, name);

                ResultSet rs = ps.executeQuery();
                
                String EventID = null;
                if(rs.next())
                {
                    
                    EventID = rs.getString("EventID");
                }
                
                
                return EventID;
                //con.close();
                
                
            } catch (SQLException ex) {
                Logger.getLogger(ViewEventDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
    
    private String getBusServiceID()
    {
             try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
                String sql = "Select `scd_db`.`BusService`.`BusServiceID` from `scd_db`.`BusService` where `scd_db`.`BusService`.`Name` = ?";  
                PreparedStatement ps =con.prepareStatement(sql);
                
                String name = SelectedBusService;
                ps.setString(1, name);

                ResultSet rs = ps.executeQuery();
                
                String BusServiceID = null;
                if(rs.next())
                {
                    
                    BusServiceID = rs.getString("BusServiceID");
                }
                
                
                return BusServiceID;
                //con.close();
                
                
            } catch (SQLException ex) {
                Logger.getLogger(ViewEventDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
    
    private String getCustomerID()
    {
        try {
                Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
                String sql = "Select `scd_db`.`Customer`.`CustomerID` from `scd_db`.`Customer` where `scd_db`.`Customer`.`Name` = ?";  
                PreparedStatement ps =con2.prepareStatement(sql);
                
                String name = LoggedInUsername;
                ps.setString(1, name);

                ResultSet rs1 = ps.executeQuery();
                rs1.next();
                
                String CustomerID = rs1.getString("CustomerID");
                System.out.println(CustomerID);
                
                return CustomerID;
            } catch (SQLException ex) {
                Logger.getLogger(ViewEventDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
        }
    
    public void populateEventS() throws SQLException
    {
        String CustomerID = getCustomerID(); 
        
        Connection con;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
        String sql = "Select * from `scd_db`.`EventCart` inner join `scd_db`.`Event` on `scd_db`.`EventCart`.`EventID` = `scd_db`.`Event`.`EventID` where `scd_db`.`EventCart`.`CustomerID` = ?";
        PreparedStatement ps =con.prepareStatement(sql); 
        
        ps.setString(1, CustomerID);
        
        ResultSet rs = ps.executeQuery();
        
        DefaultTableModel tbModel = (DefaultTableModel)cartitemstable.getModel();
        for (int i = cartitemstable.getRowCount() - 1; i >= 0; i--) {
            tbModel.removeRow(i);
        }
        
        while(rs.next())
        {
            String name = rs.getString("Name");
            String quantity = rs.getString("EventQuantity");
            String date = rs.getString("Date");
            String ticketPrice = rs.getString("TicketPrice");
            
            String tbData[] = {name, quantity, date, ticketPrice};
            
            
            tbModel.addRow(tbData);

        }
    }
    
    public void populateBusService() throws SQLException
    {
        String CustomerID = getCustomerID(); 
        
        Connection con;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
        String sql = "Select * from `scd_db`.`BusServiceCart` inner join `scd_db`.`BusService` on `scd_db`.`BusServiceCart`.`BusServiceID` = `scd_db`.`BusService`.`BusServiceID` where `scd_db`.`BusServiceCart`.`CustomerID` = ?";
        PreparedStatement ps =con.prepareStatement(sql); 
        
        ps.setString(1, CustomerID);
        
        ResultSet rs = ps.executeQuery();
        
        DefaultTableModel tbModel = (DefaultTableModel)cartitemstable.getModel();
        
        while(rs.next())
        {
            String name = rs.getString("Name");
            String quantity = rs.getString("BusServiceQuantity");
            String date = rs.getString("Date");
            String ticketPrice = rs.getString("TicketPrice");
            
            String tbData[] = {name, quantity, date, ticketPrice};
            
            
            tbModel.addRow(tbData);

        }
    }
    
    public void populate() throws SQLException
    {
        // Name Quanitity Date TicketPrice
        
        populateEventS();
        populateBusService();
        
        
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        cartitemstable = new javax.swing.JTable();
        reservebtn = new javax.swing.JButton();
        deleteitembtn = new javax.swing.JButton();
        CalculateTotal = new javax.swing.JButton();
        TotalAmount = new javax.swing.JLabel();
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

        cartitemstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Tickets Qty", "Date", "Price"
            }
        ));
        jScrollPane1.setViewportView(cartitemstable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 340, 950, 350);

        reservebtn.setText("Reserve");
        reservebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservebtnActionPerformed(evt);
            }
        });
        getContentPane().add(reservebtn);
        reservebtn.setBounds(900, 170, 120, 40);

        deleteitembtn.setText("Delete item");
        deleteitembtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteitembtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteitembtn);
        deleteitembtn.setBounds(900, 240, 120, 40);

        CalculateTotal.setText("Calculate Total");
        CalculateTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateTotalActionPerformed(evt);
            }
        });
        getContentPane().add(CalculateTotal);
        CalculateTotal.setBounds(1170, 390, 120, 40);
        getContentPane().add(TotalAmount);
        TotalAmount.setBounds(1177, 460, 110, 50);

        backgroundlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MYCART1366X768.png"))); // NOI18N
        getContentPane().add(backgroundlabel);
        backgroundlabel.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        HomePage H;
        try {
            H = new HomePage();
            
           H.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mycartpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homebtnActionPerformed

    private void eventsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventsbtnActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        EventsPage H;
        try {
            H = new EventsPage();
            
           H.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mycartpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eventsbtnActionPerformed

    private void busbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busbtnActionPerformed
        try {
            // TODO add your handling code here:
            
            this.dispose();
            BusServices H;
            H = new BusServices();
            H.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mycartpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_busbtnActionPerformed

    private void cartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartbtnActionPerformed
        try {
            // TODO add your handling code here:
            
            this.dispose();
            mycartpage H;
            H = new mycartpage();
            H.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mycartpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cartbtnActionPerformed

    private void reservedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservedbtnActionPerformed
        try {
            // TODO add your handling code here:
            
            this.dispose();
            ReservationsPage H;
            H = new ReservationsPage();
            H.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mycartpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reservedbtnActionPerformed

    
    private boolean deleteEvent()
    {
        
        try {
            // TODO add your handling code here:
            
            
            int row = cartitemstable.getSelectedRow();
            String name = cartitemstable.getModel().getValueAt(row, 0).toString();
            
            SelectedEvent = name;
            
            String EventID = getEventID();
            if(EventID != null)
            {
                
                deleteRowFromJtableAndDB(EventID);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(mycartpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
    private void deleteBusService()
    {
                
        try {
            // TODO add your handling code here:
            
            
            int row = cartitemstable.getSelectedRow();
            String name = cartitemstable.getModel().getValueAt(row, 0).toString();
            
            SelectedBusService = name;
            
            String BusServiceID = getBusServiceID();
            
            if(BusServiceID != null)
            {
                
                deleteBusServiceRowFromJtableAndDB(BusServiceID);
            }
        } catch (SQLException ex) {
            Logger.getLogger(mycartpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void deleteitembtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteitembtnActionPerformed

        if(cartitemstable.getSelectionModel(). isSelectionEmpty() == true)
        {
            
            JOptionPane.showMessageDialog(null, "No Row Selected !!!");
            return;
        }
        
        
        boolean deleted = deleteEvent();
        
        if(deleted == true)
        {
            return;
        }
        deleteBusService();
    }//GEN-LAST:event_deleteitembtnActionPerformed

    public void updateCurrentBookings(int tickets) throws SQLException
    {
        Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
        String sql = "Update `scd_db`.`Event` set `scd_db`.`Event`.`CurrentBookings` = ? where `scd_db`.`Event`.`Name` = ?";  
        PreparedStatement ps =con2.prepareStatement(sql);
        
        String name = SelectedEvent;
        ps.setInt(1, tickets);
        ps.setString(2, name);

        ps.executeUpdate();
    }
    
    
    private void deleteBusServiceRowFromJtableAndDB(String BusServiceID) throws SQLException
    {
               
        
        int row = cartitemstable.getSelectedRow();
        ((DefaultTableModel)cartitemstable.getModel()).removeRow(row);
        
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
            String sql1 = "Delete from `scd_db`.`BusServiceCart` where `scd_db`.`BusServiceCart`.`BusServiceID` = ?";
            PreparedStatement ps1 =con.prepareStatement(sql1);
            
            ps1.setString(1, BusServiceID);
            
            System.out.println("BusServiceID : "  + BusServiceID);
            
            ps1.executeUpdate();
    }
    
    
    private void deleteRowFromJtableAndDB(String EventID) throws SQLException
    {
        
        
        int row = cartitemstable.getSelectedRow();
        ((DefaultTableModel)cartitemstable.getModel()).removeRow(row);
        
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
            String sql1 = "Delete from `scd_db`.`EventCart` where `scd_db`.`EventCart`.`EventID` = ?";
            PreparedStatement ps1 =con.prepareStatement(sql1);
            
            ps1.setString(1, EventID);
            
            System.out.println("EventID : "  + EventID);
            
            ps1.executeUpdate();
    }
    
    public boolean reserveEvent()
    {
        try {                                           
            // TODO add your handling code here:
            int row = cartitemstable.getSelectedRow();
            
            String name = cartitemstable.getModel().getValueAt(row, 0).toString();
            String date = cartitemstable.getModel().getValueAt(row, 2).toString();
            
            String tickets = (String) cartitemstable.getModel().getValueAt(row, 1);
            SelectedEvent = name;
               

            
            
            try {
                updateCurrentBookings(Integer.parseInt(tickets));
            } catch (SQLException ex) {
                Logger.getLogger(mycartpage.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            {
                String CustomerID = getCustomerID();
                
                Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
                String sql = "Select * from  `scd_db`.`EventReservation` where `scd_db`.`EventReservation`.`CustomerID` = ? ";
                PreparedStatement ps =con2.prepareStatement(sql);
                
                ps.setString(1, CustomerID);
                
                ResultSet rs = ps.executeQuery();
                
                
                String EventID = getEventID();
                
                
                while(rs.next() && EventID != null)
                {
                    
                    if(EventID.equals(rs.getString("EventID")))
                    {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
                        String sql1 = "Update `scd_db`.`EventReservation` set `scd_db`.`EventReservation`.`EventQuantity` = ? where  `scd_db`.`EventReservation`.`EventID` = ?";
                        PreparedStatement ps1 =con.prepareStatement(sql1);
                        
                        int EventQuantity = rs.getInt("EventQuantity");
                        int UpdatedEventQuantity = EventQuantity + Integer.parseInt(tickets);
                        ps1.setInt(1, UpdatedEventQuantity);
                        ps1.setString(2, EventID);
                        
                        
                        ps1.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null,"Tickets Reservation Successful !!!"); 
                        
                        deleteRowFromJtableAndDB(EventID);
                        
                        return true;
                    }
                }
                
                
            }
            
            Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
            String sql = "Insert into `scd_db`.`EventReservation` values(?, ?, ?, ?, ?) ";
            PreparedStatement ps =con2.prepareStatement(sql);
            
            String CustomerID = getCustomerID();
            String EventID = getEventID();
            
            if(EventID == null)
                {
                    return false;
                }
            
            String SpecialCode = null;
            
            {
                int leftLimit = 97; // letter 'a'
                int rightLimit = 122; // letter 'z'
                int targetStringLength = 10;
                Random random = new Random();
                StringBuilder buffer = new StringBuilder(targetStringLength);
                for (int i = 0; i < targetStringLength; i++) {
                    int randomLimitedInt = leftLimit + (int) 
                      (random.nextFloat() * (rightLimit - leftLimit + 1));
                    buffer.append((char) randomLimitedInt);
                }
                SpecialCode = buffer.toString();
            }
            
            System.out.println("Tickets : " + tickets);
            System.out.println("date : " + date);
            System.out.println("CustomerID : " + CustomerID);
            System.out.println("EventID : " + EventID);
            System.out.println("SpecialCode : " + SpecialCode);
            
            ps.setString(1, CustomerID);
            ps.setString(2, EventID);
            ps.setString(3, SpecialCode);
            ps.setString(4, date);
            ps.setString(5, tickets);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Tickets Reservation Successful !!!"); 
            
            
            
            deleteRowFromJtableAndDB(EventID);
            
            return true;
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(mycartpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    private void updateBusServiceCurrentBookings(int tickets) throws SQLException
    {
        Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
        String sql = "Update `scd_db`.`BusService` set `scd_db`.`BusService`.`CurrentBookings` = ? where `scd_db`.`BusService`.`Name` = ?";  
        PreparedStatement ps =con2.prepareStatement(sql);
        
        String name = SelectedBusService;
        ps.setInt(1, tickets);
        ps.setString(2, name);

        ps.executeUpdate();
    }
    
    private void reserveBusService()
    {
        try {                                           
            // TODO add your handling code here:
            int row = cartitemstable.getSelectedRow();
            
            String name = cartitemstable.getModel().getValueAt(row, 0).toString();
            String date = cartitemstable.getModel().getValueAt(row, 2).toString();
            
            String tickets = (String) cartitemstable.getModel().getValueAt(row, 1);
            SelectedBusService= name;
               

            
            
            try {
                updateBusServiceCurrentBookings(Integer.parseInt(tickets));
            } catch (SQLException ex) {
                Logger.getLogger(mycartpage.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            {
                String CustomerID = getCustomerID();
                
                Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
                String sql = "Select * from  `scd_db`.`BusServiceReservation` where `scd_db`.`BusServiceReservation`.`CustomerID` = ? ";
                PreparedStatement ps =con2.prepareStatement(sql);
                
                ps.setString(1, CustomerID);
                
                ResultSet rs = ps.executeQuery();
                
                
                String BusServiceID = getBusServiceID();
                while(rs.next())
                {
                    
                    if(BusServiceID.equals(rs.getString("BusServiceID")))
                    {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
                        String sql1 = "Update `scd_db`.`BusServiceReservation` set `scd_db`.`BusServiceReservation`.`BusServiceQuantity` = ? where  `scd_db`.`BusServiceReservation`.`BusServiceID` = ?";
                        PreparedStatement ps1 =con.prepareStatement(sql1);
                        
                        int BusServiceQuantity = rs.getInt("BusServiceQuantity");
                        int UpdatedBusServiceQuantity = BusServiceQuantity + Integer.parseInt(tickets);
                        ps1.setInt(1, UpdatedBusServiceQuantity);
                        ps1.setString(2, BusServiceID);
                        
                        
                        ps1.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null,"Tickets Reservation Successful !!!"); 
                        
                        deleteBusServiceRowFromJtableAndDB(BusServiceID);
                        
                        return;
                    }
                }
                
                
            }
            
            Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
            String sql = "Insert into `scd_db`.`BusServiceReservation` values(?, ?, ?, ?, ?) ";
            PreparedStatement ps =con2.prepareStatement(sql);
            
            String CustomerID = getCustomerID();
            String BusServiceID = getBusServiceID();
            
            String SpecialCode = null;
            
            {
                int leftLimit = 97; // letter 'a'
                int rightLimit = 122; // letter 'z'
                int targetStringLength = 10;
                Random random = new Random();
                StringBuilder buffer = new StringBuilder(targetStringLength);
                for (int i = 0; i < targetStringLength; i++) {
                    int randomLimitedInt = leftLimit + (int) 
                      (random.nextFloat() * (rightLimit - leftLimit + 1));
                    buffer.append((char) randomLimitedInt);
                }
                SpecialCode = buffer.toString();
            }
            
            System.out.println("Tickets : " + tickets);
            System.out.println("date : " + date);
            System.out.println("CustomerID : " + CustomerID);
            System.out.println("EventID : " + BusServiceID);
            System.out.println("SpecialCode : " + SpecialCode);
            
            ps.setString(1, CustomerID);
            ps.setString(2, BusServiceID);
            ps.setString(3, SpecialCode);
            ps.setString(4, date);
            ps.setString(5, tickets);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Tickets Reservation Successful !!!"); 
              
            
            deleteBusServiceRowFromJtableAndDB(BusServiceID);
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(mycartpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void reservebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservebtnActionPerformed
        
        
        if(cartitemstable.getSelectionModel(). isSelectionEmpty() == true)
        {
            
            JOptionPane.showMessageDialog(null, "No Row Selected !!!");
            return;
        }
        
        boolean reserved = reserveEvent();
        if(reserved == true)
        {
            return;
        }
        
        reserveBusService();
        
    }//GEN-LAST:event_reservebtnActionPerformed

    private void CalculateTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateTotalActionPerformed
        try {
            // TODO add your handling code here:
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_db", "root", "123456");
            String sql1 = "Select * from `scd_db`.`EventCart` inner join `scd_db`.`Event` on `scd_db`.`EventCart`.`EventID` = `scd_db`.`Event`.`EventID` where `scd_db`.`EventCart`.`CustomerID` = ?";
            PreparedStatement ps1 =con.prepareStatement(sql1);
            
            String CustomerID = getCustomerID();
            ps1.setString(1, CustomerID);
            
            ResultSet rs = ps1.executeQuery();
            Integer sum = 0;
            
            while(rs.next())
            {
                int ticketPrice =0;
                int quantity = 0;
                
                ticketPrice = rs.getInt("TicketPrice");
                quantity = rs.getInt("EventQuantity");
                
                sum += ticketPrice * quantity;
            }
            
            TotalAmount.setText(sum.toString());
            
        } catch (SQLException ex) {
            Logger.getLogger(mycartpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CalculateTotalActionPerformed

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
                //new mycartpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalculateTotal;
    private javax.swing.JLabel TotalAmount;
    private javax.swing.JLabel backgroundlabel;
    private javax.swing.JButton busbtn;
    private javax.swing.JButton cartbtn;
    private javax.swing.JTable cartitemstable;
    private javax.swing.JButton deleteitembtn;
    private javax.swing.JButton eventsbtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reservebtn;
    private javax.swing.JButton reservedbtn;
    // End of variables declaration//GEN-END:variables
}
