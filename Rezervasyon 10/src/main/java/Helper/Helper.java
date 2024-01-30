/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Helper {
    public static void showMsg(String str) {
        String msg;
        
        switch(str) {
            case "wrong":
                msg = "Kullanici adi veya sifre hatali.";
                break;
            default:
                msg = str;
        }
        JOptionPane.showMessageDialog(null, msg, "Mesaj", JOptionPane.INFORMATION_MESSAGE);
    }
}
