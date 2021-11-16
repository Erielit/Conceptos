/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.listaDobleEnlazada.examen;

/**
 *
 * @author CC-7
 */
public class Jugador {

    private String nombre;
    private double puntuacion;
    private int ganados;

    public Jugador() {
    }

    public Jugador(String nombre, double puntuacion, int ganados) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.ganados = ganados;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    
}
