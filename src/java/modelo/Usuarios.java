/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author javi_
 */
public class Usuarios {
    private String email;
    private String pass;
    private boolean isAdmin;

    public Usuarios() {
    }

    public Usuarios(String email, String pass,boolean isAdmin) {
        this.isAdmin = isAdmin;
        this.email = email;
        this.pass = pass;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean tipo) {
        this.isAdmin = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }    
}