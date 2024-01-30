/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rezervasyon.View;

/**
 *
 * @author melisportakal
 */
public abstract class  Vehicle {
    private int koltuksayisi;
    private String aracid;
    private String yakit;
    
    public Vehicle(int koltuksayisi,String aracid,String yakit)
    {
        this.aracid = aracid;
        this.koltuksayisi = koltuksayisi;
        this.yakit = yakit;
    }
    
    public String getaracid()
    {
        return aracid;
    }
    public int getkoltuksayisi()
    {
        return koltuksayisi;
    }
    public String getyakit()
    {
        return yakit;
    }
            
    
}
