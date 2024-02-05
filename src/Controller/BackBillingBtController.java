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
public class BackBillingBtController implements ActionListener {
    private BillingWindow bw;
    private MenuWindow mw;

    public BackBillingBtController(BillingWindow bw, MenuWindow mw) {
        this.bw = bw;
        this.mw = mw;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        bw.dispose();
        mw.setVisible(true);
    }
    
}
