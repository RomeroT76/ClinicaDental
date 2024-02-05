/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.AppointmentWindow;
import View.MenuWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rober
 */
public class AppointmentBtController implements ActionListener {
    private MenuWindow mw;
    private AppointmentWindow aw;

    public AppointmentBtController(MenuWindow mw, AppointmentWindow aw) {
        this.mw = mw;
        this.aw = aw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       mw.dispose();
       aw.setVisible(true);
    }
    
}
