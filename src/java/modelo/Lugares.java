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
public class Lugares {
    
    private String nombre;
    private int tasaAeropuerto;
    private boolean isOrigen;           // si es verdadero sera un lugar de origen si es falso es un lugar de destino

    public Lugares() {

    }

    public Lugares(String nombre, int tasaAeropuerto, boolean tipo) {
        this.nombre = nombre;
        this.tasaAeropuerto = tasaAeropuerto;
        this.isOrigen =  tipo;            
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTasaAeropuerto() {
        return tasaAeropuerto;
    }

    public void setTasaAeropuerto(int tasaAeropuerto) {
        this.tasaAeropuerto = tasaAeropuerto;
    }

    public boolean isOrigen() {
        return isOrigen;
    }

    public void setOrigen(boolean tipo) {
        this.isOrigen = tipo;
    }
}
