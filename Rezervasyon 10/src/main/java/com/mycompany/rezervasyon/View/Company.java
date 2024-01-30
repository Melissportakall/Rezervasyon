/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rezervasyon.View;

import static com.mycompany.rezervasyon.View.LoginGUI.compList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Company extends User implements IProfitable {
    Map<Integer, Company> companyMap = new HashMap<>();
    
    private int Id;
    private String Vehicle;
    private String VehicleType;
    private String FuelType;
    private String SeatNumber;
    private int ExpeditionNo;
    
    public void setId(int Id){ this.Id = Id; }
    public void setVehicle(String vehicle){ this.Vehicle = vehicle; }
    public void setVehicleType(String VehicleType){ this.VehicleType = VehicleType; }
    public void setFuelType(String FuelType){ this.FuelType = FuelType; }
    public void setSeatNumber(String SeatNumber){ this.SeatNumber = SeatNumber; }
    public void setExpeditionNo(int ExpeditionNo){ this.ExpeditionNo = ExpeditionNo; }
    
    public int getId() {return this.Id;}
    public String getVehicle() {return this.Vehicle;}
    public String getVehicleType() {return this.VehicleType;}
    public String getFuelType() {return this.FuelType;}
    public String getSeatNumber() {return this.SeatNumber;}
    public int getExpeditionNo() {return this.ExpeditionNo;}


    public static int i = 0;
    public Company(String compName, String compPass) {
        super(compName, compPass);
        
    }  

    
    
    void fillAdminGui(ResultSet rs, AdminGUI admingui) {          
         try {
        DefaultTableModel tblModel = (DefaultTableModel)admingui.gettable2().getModel();
        
        while(rs.next()) {
            String compName = rs.getString("CompName");
            boolean exists = false;
            for (int i = 0; i < tblModel.getRowCount(); i++) {
                if (tblModel.getValueAt(i, 0).equals(compName)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                Vector<Object> row = new Vector<>();
                row.add(compName);
                row.add(rs.getString("CompPass"));
                tblModel.addRow(row);
            }
        }
        
        admingui.gettable2().setModel(tblModel);
    } catch (SQLException ex) {
        SQLException name = ex;
    }
}
    
    void fillCompGui(ResultSet rs, String compLogin, aCompanyGUI acompgui) {          
        try {
            DefaultTableModel tblModel = (DefaultTableModel)acompgui.gettable2().getModel();
            tblModel.setRowCount(0);
            while(rs.next()) {
                if (compLogin.equals(rs.getString("CompName"))){
                    Vector<Object> row = new Vector<>();
                    row.add(rs.getString("VehicleName"));
                    row.add(rs.getString("VehicleType"));
                    row.add(rs.getString("FuelType"));
                    row.add(rs.getString("SeatNumber"));
                    row.add(rs.getString("SeferNo"));
                    tblModel.addRow(row);
                }
            }
            acompgui.gettable2().setModel(tblModel);
        } catch (SQLException ex) {
            SQLException name = ex;
        }
}
    
    void fillCompGui2(ResultSet rs, String compLogin, aCompanyGUI acompgui) {         
        try {
            AdminGUI admgu = new AdminGUI();
            DefaultTableModel tblModel = (DefaultTableModel)admgu.gettable2().getModel();
            tblModel.setRowCount(0);
            while(rs.next()) {
                if (compLogin.equals(rs.getString("CompName"))){
                    Vector<Object> row = new Vector<>();
                    row.add(rs.getString("VehicleName"));
                    row.add(rs.getString("FuelType"));
                    row.add(rs.getString("SeatNumber"));
                    row.add(rs.getString("SeferNo"));
                    tblModel.addRow(row);
                }
            }
            acompgui.gettable2().setModel(tblModel);
        } catch (SQLException ex) {
            SQLException name = ex;
        }
        }
    
    
    public Company fillComp(ResultSet rs, String compLogin) throws SQLException { 
        if(compLogin.equals(rs.getString("CompName"))) {
        Company zx = new Company(rs.getString("CompName"), rs.getString("CompPass"));
        zx.setId(rs.getInt("id"));                        
        zx.setVehicle(rs.getString("VehicleName"));
        zx.setFuelType(rs.getString("FuelType"));
        zx.setVehicleType(rs.getString("VehicleType"));
        zx.setSeatNumber(rs.getString("SeatNumber"));
        zx.setExpeditionNo(rs.getInt("SeferNo"));
        compList.companyMap.put(rs.getInt("id"), zx);
        return zx;
        }
        return null;
    }
    
    
    public Company fillComp2(ResultSet rs) throws SQLException { 

        Company zx = new Company(rs.getString("CompName"), rs.getString("CompPass"));
        zx.setId(rs.getInt("id"));                        
        zx.setVehicle(rs.getString("VehicleName"));
        zx.setFuelType(rs.getString("FuelType"));
        zx.setVehicleType(rs.getString("VehicleType"));
        zx.setSeatNumber(rs.getString("SeatNumber"));
        zx.setExpeditionNo(rs.getInt("SeferNo"));
        compList.companyMap.put(rs.getInt("id"), zx);
        return zx;
    }
}

