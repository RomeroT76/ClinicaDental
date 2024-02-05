/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class CloseBtController implements ActionListener{

    public CloseBtController() {
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       int op = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar la aplicacion", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    
}
