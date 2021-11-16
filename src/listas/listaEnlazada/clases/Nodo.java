/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.listaEnlazada.clases;

/**
 *
 * @author netmo
 */
public class Nodo {
    private Nodo siguiente;
    private Object info;

    public Nodo(Object info) {
        this.siguiente = null;
        this.info = info;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Nodo siguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
