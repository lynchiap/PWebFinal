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
public class Asiento {
    private int idVuelo;
    private Date date;
    private int numAsiento;
    private boolean ocupado;

    public Asiento() {
    }

    public Asiento(int idVuelo, Date date, int numAsiento, boolean ocupado) {
        this.idVuelo = idVuelo;
        this.date = date;
        this.numAsiento = numAsiento;
        this.ocupado = ocupado;
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

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
