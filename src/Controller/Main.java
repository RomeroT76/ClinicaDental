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

/**
 *
 * @author rober
 */
public class Main {
    
    public static void main(String[] args) {
        ConnectionCDDB.getConnection();
        UserDao ud = new UserDao();
        
        LogInWindow lw = new LogInWindow();
        
        IngresarBtController ibc = new IngresarBtController(ud, lw);
        
        lw.setVisible(true);
        lw.setLocationRelativeTo(null);
        lw.setIngresarActionListener(ibc);
        
    }
    
}
