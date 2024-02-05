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
public class CustomerBtController implements ActionListener{
    private MenuWindow mw;
    private CustomerWindow cw;

    public CustomerBtController(MenuWindow mw, CustomerWindow cw) {
        this.mw = mw;
        this.cw = cw;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       mw.dispose();
       cw.setVisible(true);
    }
    
}
