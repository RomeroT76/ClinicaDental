/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

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
        User cu = new User();
        UserDao ud = new UserDao();
        
        LogInWindow lw = new LogInWindow();
        MenuWindow mw = new MenuWindow();
        CustomerWindow cw = new CustomerWindow();
        AppointmentWindow aw = new AppointmentWindow();
        BillingWindow bw = new BillingWindow();
        
        IngresarBtController ibc = new IngresarBtController(ud, lw, mw, cu);
        CloseBtController cbc = new CloseBtController();
        LogOutBtController lobc = new LogOutBtController(cu, lw, mw);
        CustomerBtController cubc = new CustomerBtController(mw, cw);
        AppointmentBtController abc = new AppointmentBtController(mw, aw);
        BillingBtController bbc = new BillingBtController(mw, bw);
        BackCustomerBTListener bcbl = new BackCustomerBTListener(cw, mw);
        BackAppointmentBtController babc = new BackAppointmentBtController(aw, mw);
        BackBillingBtController bbbc = new BackBillingBtController(bw, mw);
        
        lw.setIngresarActionListener(ibc);
        lw.setCloseListener(cbc);
        
        mw.setCloseListener(cbc);
        mw.setLogOutListener(lobc);
        mw.setMenusBtListeners(cubc, abc, bbc);
        
        cw.SetBackBtListener(bcbl);
        
        aw.setBackBtListener(babc);
        
        bw.setBackBtListener(bbbc);
    }
    
}
