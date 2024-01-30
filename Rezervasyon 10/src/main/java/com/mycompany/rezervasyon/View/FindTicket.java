/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rezervasyon.View;

import Helper.Connections;
import Helper.Helper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class FindTicket extends javax.swing.JFrame {

    /**
     * Creates new form FindTicket
     */
    public static String Date;
    private Connections conn = new Connections();


    public FindTicket(String FindTicket) {
        this.Date = FindTicket;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ftGoBack = new javax.swing.JButton();
        jBuyTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company Name", "Vehicle Type", "Destination", "ExpeditionNo"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        ftGoBack.setText("GO BACK");
        ftGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftGoBackActionPerformed(evt);
            }
        });

        jBuyTicket.setText("Buy Ticket");
        jBuyTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuyTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ftGoBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBuyTicket)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftGoBack)
                    .addComponent(jBuyTicket))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ftGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftGoBackActionPerformed
        // TODO add your handling code here:
        Admin admn = new Admin("", "");
        Company comp = new Company("","");
        LoginGUI logingui = new LoginGUI(admn, comp); 
        logingui.setVisible(true);
        dispose();
    }//GEN-LAST:event_ftGoBackActionPerformed

    private void jBuyTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuyTicketActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
        if(jTable2.getSelectedRowCount() == 1)
        {
            int selectedRowIndex = jTable2.getSelectedRow();
            Object cellValue = tblModel.getValueAt(selectedRowIndex, 0);
            Object cellValue1 = tblModel.getValueAt(selectedRowIndex, 1);
            try {
            Connection con = conn.connDB();
            String sql = "SELECT id FROM company WHERE CompName = ? AND VehicleName = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setObject(1, cellValue);
            preparedStatement.setObject(2, cellValue1);
            ResultSet resultSet = preparedStatement.executeQuery();
             if (resultSet.next()) {
                int primaryKey = resultSet.getInt("id");
                BuyTicket buytckt = new BuyTicket(Date, primaryKey);
                buytckt.setVisible(true);
                dispose();
            }
            con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else
        {
            if(jTable2.getRowCount() == 0)
            {    
                Helper.showMsg("Table is emty");
            }
            else
            {
                Helper.showMsg("Please Select single row for delete");
            }
        }
    }//GEN-LAST:event_jBuyTicketActionPerformed

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
            java.util.logging.Logger.getLogger(FindTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindTicket(Date).setVisible(true);
            }
        });
    }
    public javax.swing.JTable gettable2Find() {
        return this.jTable2;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ftGoBack;
    private javax.swing.JButton jBuyTicket;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
