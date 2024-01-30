/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rezervasyon;
import com.mycompany.rezervasyon.View.LoginGUI;
import com.mycompany.rezervasyon.View.User;
import com.mycompany.rezervasyon.View.Admin;
import com.mycompany.rezervasyon.View.Company;
/**
 *
 * @author Administrator
 */
public class Rezervasyon {

    public static void main(String[] args) {
        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    
    
    Admin userL = new Admin("Admin", "Admin");
    Company compL = new Company("","");
    
    java.awt.EventQueue.invokeLater(() -> {
        LoginGUI loginScreen = new LoginGUI(userL, compL);
        loginScreen.setVisible(true);
            }); 
    }
    }