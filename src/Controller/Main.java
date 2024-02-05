/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DbConnection.ConnectionCDDB;
import Model.User;
import Model.UserDao;
import View.AppointmentWindow;
import View.BillingWindow;
import View.CustomerWindow;
import View.LogInWindow;
import View.MenuWindow;
import javax.swing.ImageIcon;

/**
 *
 * @author rober
 */
public class Main {
    
    public static void main(String[] args) {
        User cu = new User();
        UserDao ud = new UserDao();
        
        LogInWindow lw = new LogInWindow();
        MenuWindow mw = new MenuWindow();
        
        IngresarBtController ibc = new IngresarBtController(ud, lw, mw, cu);
        CloseBtController cbc = new CloseBtController();
        LogOutBtController lobc = new LogOutBtController(cu, lw, mw);
        
        lw.setIngresarActionListener(ibc);
        lw.setCloseListener(cbc);
        
        mw.setCloseListener(cbc);
        mw.setLogOutListener(lobc);
    }
    
}
