/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import DbConnection.ConnectionCDDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class UserDao {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs; 
    private final ArrayList<User> users;
    private String query;

    public UserDao() {
        users = new ArrayList<>();
    }
    
    public void toList() {
        query = "SELECT * FROM cd_usuarios";
        try {
            con = ConnectionCDDB.getConnection();
            ps = con.prepareStatement(query); 
            rs = ps.executeQuery();
            while(rs.next()) {
                User u = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)); 
                users.add(u);
            }
        } catch (SQLException e) {
            System.out.println("ERRR-->" + e.getMessage());
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
