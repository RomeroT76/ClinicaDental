/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.LogInWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author erick
 */
public class LC_Cerrar implements ActionListener{
    
    private LogInWindow login;

    public LC_Cerrar(LogInWindow login) {
        this.login = login;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        login.dispose();
    }
    
}
