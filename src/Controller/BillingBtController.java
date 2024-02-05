/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.BillingWindow;
import View.MenuWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rober
 */
public class BillingBtController implements ActionListener {
    private MenuWindow mw;
    private BillingWindow bw;

    public BillingBtController(MenuWindow mw, BillingWindow bw) {
        this.mw = mw;
        this.bw = bw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mw.dispose();
        bw.setVisible(true);
    }
    
}
