/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class Connections {
    Connection c = null;
    
    public Connections() {}
    
    public Connection connDB() {
        try {
        this.c = DriverManager.getConnection("jdbc:mysql://localhost:8080/rezerv","root","");
        return c;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }
}
