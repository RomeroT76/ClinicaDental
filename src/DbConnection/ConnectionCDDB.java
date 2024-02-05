/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DbConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class ConnectionCDDB {
    private static Connection con ;
    private static final String DBUSER = "Clinica_Dental";
    private static final String DBPASSWORD = "cd123";
    private static final String DBURL = "jdbc:oracle:thin:@localhost:1521:xe";
    
    public static Connection getConnection() {
        try {
            if(con == null) {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
                System.out.println("Conexion Creada");
            } else {
                System.out.println("Conexion ya exitente");
                return con;
           }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed" + e.getMessage());
        }
        return con;
    }
}
