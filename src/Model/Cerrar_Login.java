/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import View.LogInWindow;
import javax.swing.JButton;
/**
 *
 * @author erick
 */
public class Cerrar_Login {
    private LogInWindow l;
    
    public Cerrar_Login(LogInWindow l){
        this.l=l;
        configurarBotonCerrar();
    }
    
    private void configurarBotonCerrar() {
        JButton botonCerrar = l.getBotonSalir();
    }
}
