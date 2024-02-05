/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import Model.UserDao;
import View.LogInWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class IngresarBtController  implements ActionListener{
    UserDao ud;
    LogInWindow lw;

    public IngresarBtController(UserDao ud, LogInWindow lw) {
        this.ud = ud;
        this.lw = lw;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean fl = false;
        String permiso = "";
        ud.toList();
        for(User u : ud.getUsers()) {
            if(u.getUserName().equalsIgnoreCase(lw.getUserName()) 
                    && u.getPassword().equalsIgnoreCase(lw.getPassword())) {
                fl = true;
                permiso = u.getRol();
                break;
            }
        }  
         if(fl == true) {
                JOptionPane.showMessageDialog(null, "Credenciales Validas");
                if(permiso.equalsIgnoreCase("a")) {
                    JOptionPane.showMessageDialog(null, "Admin");
                } else {
                    JOptionPane.showMessageDialog(null, "Gen");
                }
         } else {
                JOptionPane.showMessageDialog(null, "Credenciales Invalidas");
            }
    }
    
}
