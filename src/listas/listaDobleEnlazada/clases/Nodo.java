package listas.listaDobleEnlazada.clases;

public class Nodo {

    private Nodo siguiente;
    private Nodo antes;
    private Object info;

    public Nodo(Object info) {
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

    public Nodo antes() {
        return antes;
    }

    public void setAntes(Nodo antes) {
        this.antes = antes;
    }

}
