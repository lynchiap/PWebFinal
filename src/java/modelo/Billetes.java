/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author javi_
 */
public class Billetes {
    private String emailUser;
    private String idBillete;
    private int idVuelo;
    private Date date;
    private int numAsiento;
    private String nombrePasajero;
    private String apellidoPasajero;
    private String dni;

    public Billetes() {
    }

    public Billetes(String emailUser, String idBillete, int idVuelo, Date date, int numAsiento) {
        this.emailUser = emailUser;
        this.idBillete = idBillete;
        this.idVuelo = idVuelo;
        this.date = date;
        this.numAsiento = numAsiento;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getIdBillete() {
        return idBillete;
    }

    public void setIdBillete(String idBillete) {
        this.idBillete = idBillete;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public String getApellidoPasajero() {
        return apellidoPasajero;
    }

    public void setApellidoPasajero(String apellidoPasajero) {
        this.apellidoPasajero = apellidoPasajero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }   
}
