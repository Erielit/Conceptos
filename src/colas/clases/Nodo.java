package colas.clases;

public class Nodo {
    private Object info;
    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(Object info) {
        this.info = info;
        this.siguiente = null;
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
