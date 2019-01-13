/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author javi_
 */
public class User{
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private int numeroTelefono;
    private String dni;
    private int numeroVisa;
    private ArrayList<Billetes> billetes;

    public User() {
    }

    public User(String nombre, String apellidos, Date fechaNacimiento, 
            int numeroTelefono, String dni, int numeroVisa, ArrayList<Billetes> billetes) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.dni = dni;
        this.numeroVisa = numeroVisa;
        this.billetes = billetes;
    }

   


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public ArrayList<Billetes> getBilletes() {
        return billetes;
    }

    public void addBillete(Billetes billete) {
        billetes.add(billete);
    }
    
    public int getnumeroBilletes(){
        return billetes.size();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumeroVisa() {
        return numeroVisa;
    }

    public void setNumeroVisa(int numeroVisa) {
        this.numeroVisa = numeroVisa;
    }
    
}
