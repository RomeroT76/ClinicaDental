/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import Model.UserDao;
import View.LogInWindow;
import View.MenuWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class IngresarBtController  implements ActionListener{
    private UserDao ud;
    private LogInWindow lw;
    private MenuWindow mw;
    private User cu;

    public IngresarBtController(UserDao ud, LogInWindow lw, MenuWindow mw, User cu) {
        this.ud = ud;
        this.lw = lw;
        this.mw = mw;
        this.cu = cu;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean fl = false;
        ud.toList();
        for(User u : ud.getUsers()) {
            if(u.getUserName().equalsIgnoreCase(lw.getUserName()) 
                    && u.getPassword().equals(lw.getPassword())) {
                fl = true;
                cu.setCurrentUser(u.getUserName());
                cu.setCurrentRol(u.getRol());
                break;
            }
        }  
         if(fl == true) {
                JOptionPane.showMessageDialog(null, "Credenciales Validas");
                lw.dispose();
                lw.setCampoUsuario("");
                lw.setjPasswordField1("");
                mw.setVisible(true);
         } else {
                JOptionPane.showMessageDialog(null, "Credenciales Invalidas");
            }
    }
    
}
