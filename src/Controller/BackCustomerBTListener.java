/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.CustomerWindow;
import View.MenuWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rober
 */
public class BackCustomerBTListener implements  ActionListener {
    private CustomerWindow cw;
    private MenuWindow mw;

    public BackCustomerBTListener(CustomerWindow cw, MenuWindow mw) {
        this.cw = cw;
        this.mw = mw;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       cw.dispose();
       mw.setVisible(true);
    }
    
}
