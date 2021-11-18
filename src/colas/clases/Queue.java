package colas.clases;

import colas.interfaces.QueueMethods;

public class Queue implements QueueMethods {

    Nodo first;
    Nodo last;

    @Override
    public void add(Object info) {
        Nodo nuevo = new Nodo(info);
        if (this.isEmpty()) {
            this.first = nuevo;
        } else {
            this.last.setSiguiente(nuevo);
        }
        this.last = nuevo;
    }

    @Override
    public Object poll() {
        if (!this.isEmpty()) {
            Nodo eliminar = this.first;
            this.first = this.first.siguiente();
            eliminar.setSiguiente(null);
            return eliminar.getInfo();
        }
        return null;
    }

    @Override
    public Object peek() {
        return this.isEmpty() ? null : this.first.getInfo();
    }

    @Override
    public boolean isEmpty() {
        return (this.last == null && this.first == null);
    }

    @Override
    public int size() {
        int cont = 0;
        Nodo aux = this.iterator();
        while (aux != null) {
            cont++;
            aux = aux.siguiente();
        }
        return cont;
    }

    @Override
    public Object search(String param) {
        if (this.isEmpty()) {
            System.out.println("Cola vacía");
        } else {
            Nodo aux = this.iterator();
            do {
                if (aux.getInfo().toString().equals(param)) {
                    return aux.getInfo();
                }
                aux = aux.siguiente();
            } while (aux != null);
        }
        return null;
    }

    @Override
    public Nodo iterator() {
        return this.first;
    }

    @Override
    public void print() {
        if (this.isEmpty()) {
            System.out.println("Cola vacía");
        } else {
            Nodo aux = this.iterator();
            do {
                System.out.println("[" + aux.getInfo().toString() + "," + aux + "]");
                aux = aux.siguiente();
            } while (aux != null);
        }
    }

}
