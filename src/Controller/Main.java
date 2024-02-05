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
        ud.toList();
        for(User u : ud.getUsers()) {
            System.out.println(u);
        }
//        AppointmentWindow aw = new AppointmentWindow();
//        BillingWindow bw = new BillingWindow();
//        CustomerWindow cw = new CustomerWindow();
        LogInWindow lw = new LogInWindow();
//        MenuWindow mw = new MenuWindow();
//        
        LC_Cerrar adc = new LC_Cerrar(lw);
        lw.addListenerCerrar(adc);
//        
//        aw.setVisible(true);
//        aw.setLocationRelativeTo(null);
//        bw.setVisible(true);
//        bw.setLocationRelativeTo(null);
//        cw.setVisible(true);
//        cw.setLocationRelativeTo(null);
        lw.setVisible(true);
        lw.setLocationRelativeTo(null);
//        mw.setVisible(true);
//        mw.setLocationRelativeTo(null);
    }
    
}
