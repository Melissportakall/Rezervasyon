/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rezervasyon.View;
import java.util.HashMap;
import java.util.Map;
import com.mycompany.rezervasyon.View.LoginGUI;
import java.util.ArrayList;
/**.
 *
 * @author Administrator
 */
public abstract class User implements ILoginable {
    private String Name;
    private String Pass;

    public User(String Name, String Pass) {
        this.Name = Name;
        this.Pass = Pass;
    }
    
    String getName() {return this.Name;}
    String getPass() {return this.Pass;}


}
