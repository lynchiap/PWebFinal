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
    private ArrayList<Vuelo> vuelos;

    public User() {
    }

    public User(String nombre, String apellidos, Date fechaNacimiento, int numeroTelefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.vuelos = new ArrayList<>();
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

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void addVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }
    
    public int getnumeroVuelos(){
        return vuelos.size();
    }
}
