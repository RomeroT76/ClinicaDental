/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rober
 */
public class User {
    private int userId;
    private String userName;
    private String password;
    private String rol;
    private String currentUser;
    private String currentRol;

    public User(int userId, String userName, String password, String rol) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.rol = rol;
        this.currentUser = "";
        this.currentRol = "";
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public String getCurrentRol() {
        return currentRol;
    }

    public void setCurrentRol(String currentRol) {
        this.currentRol = currentRol;
    }
    
    

    @Override
    public String toString() {
        return this.getUserName() + " " + this.getPassword() + " " + this.getRol();
    }
}
