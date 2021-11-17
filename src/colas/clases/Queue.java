package colas.clases;

import colas.interfaces.QueueMethods;

public class Queue implements QueueMethods {

    Nodo first;
    Nodo last;

    @Override
    public void put(Object info) {
        Nodo nuevo = new Nodo(info);
        if (this.isEmpty()) {
            this.last = nuevo;
            this.first = nuevo;
        } else {
            this.last.setSiguiente(nuevo);
            this.last = nuevo;
        }
    }

    @Override
    public Object offer() {
        if (this.isEmpty()) {
            System.out.println("Cola vacía");
        } else {
            Object obj = this.first.getInfo();
            this.first = this.first.siguiente();
            return obj;
        }
        return null;
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
