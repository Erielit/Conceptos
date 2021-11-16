package pilas.clases;

public class Nodo {
    private Object information;
    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(Object information) {
        this.information = information;
        this.siguiente = null;
    }

    public Nodo siguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Object getInformation() {
        return information;
    }

    public void setInformation(Object information) {
        this.information = information;
    }
    
    
}
