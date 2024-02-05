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
public class BackAppointmentBtController implements ActionListener {
    private AppointmentWindow aw;
    private MenuWindow mw;

    public BackAppointmentBtController(AppointmentWindow aw, MenuWindow mw) {
        this.aw = aw;
        this.mw = mw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        aw.dispose();
        mw.setVisible(true);
    }
    
}
