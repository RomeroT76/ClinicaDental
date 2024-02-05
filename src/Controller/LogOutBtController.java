/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import View.LogInWindow;
import View.MenuWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class LogOutBtController implements ActionListener {
    private User cu;
    private LogInWindow lw;
    private MenuWindow mw;

    public LogOutBtController(User cu, LogInWindow lw, MenuWindow mw) {
        this.cu = cu;
        this.lw = lw;
        this.mw = mw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int op = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar sesion?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            cu.setCurrentUser("");
            cu.setCurrentRol("");
            mw.dispose();
            lw.setVisible(true);
        }
    }
    
}
