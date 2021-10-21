package listaCircular.clases;

import listaCircular.interfaces.ListaCircularInterface;

public class ListaCircular implements ListaCircularInterface {

    private Nodo origin = null;
    private int size = 0;

    @Override
    public void add(int posicion, Object info) {
        if (posicion < 0) {
            System.out.println("No existe la posicion");
        } else if(posicion >= 0 && posicion < this.size){
            Nodo nuevo = new Nodo(info);
            if (this.isEmpty()) {
                nuevo.setSiguiente(nuevo);
                origin = nuevo;
            } else {
                while (size != posicion) {
                    
                }
            }
            size++;
        }else if(posicion > this.size){
            System.out.println("Está fuera de rango");   
        }        
    }

    @Override
    public void addFirst(Object info) {
        Nodo nodo = new Nodo(info);
        if (this.isEmpty()) {
            nodo.setSiguiente(nodo);
            origin = nodo;
        } else {
            nodo.setSiguiente(origin);
            origin.setSiguiente(nodo);
            origin = nodo;
        }
        size++;
    }

    @Override
    public void addLast(Object info) {
        Nodo nodo = new Nodo(info);
        if (this.isEmpty()) {
            nodo.setSiguiente(nodo);
            origin = nodo;
        } else {
            Nodo aux = this.iterator();
            while (aux.siguiente() != origin) {
                aux = aux.siguiente();
            }
            aux.setSiguiente(nodo);
            nodo.setSiguiente(origin);
        }
        size++;
    }

    @Override
    public void remove(int posicion) {

    }

    @Override
    public void removeFirst() {
        if (this.isEmpty()) {
            System.out.println("La lista esta vacía");
        }else{
            Nodo aux = this.iterator();
            while (aux.siguiente() != origin) {
                aux = aux.siguiente();
            }
            Nodo nodoEliminar = this.iterator();
            origin = nodoEliminar.siguiente();
            nodoEliminar.setSiguiente(null);
            nodoEliminar = null;
            aux.setSiguiente(origin);
            size--;
        }
    }

    @Override
    public void removeLast() {
        if (this.isEmpty()) {
            System.out.println("La lista esta vacía");
        } else {
            Nodo aux = this.iterator();
            while (aux.siguiente().siguiente() != origin) {
                aux = aux.siguiente();
            }
            Nodo nodoEliminar = aux.siguiente();
            aux.setSiguiente(this.iterator());
            nodoEliminar.setSiguiente(null);
            nodoEliminar = null;
            size--;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return origin == null;
    }

    @Override
    public Nodo iterator() {
        return origin;
    }

    @Override
    public Nodo search(String buscar) {
        Nodo aux = this.iterator();
        Nodo encontrado = null;
        while (aux.siguiente() != this.origin) {
            if (aux.getInfo() instanceof Elefante) {
                if (((Elefante)aux.getInfo()).getNombre().equals(buscar)) {
                    encontrado = aux;
                    break;
                }
            }
            aux = aux.siguiente();
        }
        return encontrado;
    }

    @Override
    public Nodo get(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void set(int posicion, Object info) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printList() {
        Nodo auxNodo = origin;
        do {
            System.out.print("" + auxNodo.getInfo().toString());
            auxNodo = auxNodo.siguiente();
        } while (auxNodo != origin);

    }

}
