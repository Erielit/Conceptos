package listaEnlazada.clases;

import listaEnlazada.intefaces.ListMethods;

public class ListaEnlazada implements ListMethods {

    Nodo origen;
    int length;

    @Override
    public void add(int posicion, Object info) {
        Nodo nuevo = new Nodo(info);
        if (this.isEmpty()) {
            if (posicion == 0) {
                this.addFirst(nuevo);
            } else {
                int auxPosicion = 1;
                Nodo aux = this.iterator();
                while (auxPosicion != posicion) {
                    aux = aux.siguiente();
                    auxPosicion++;
                }
                Nodo despues = aux.siguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(despues);
            }
            length++;
        }
    }

    @Override
    public void addFirst(Object info) {
        Nodo nuevo = new Nodo(info);
        if (this.length == 0) {
            this.origen = nuevo;
        } else {
            Nodo aux = this.origen;
            nuevo.setSiguiente(aux);
            this.origen = nuevo;
        }
        length++;
    }

    @Override
    public void addLast(Object informacion) {
        Nodo nuevo = new Nodo(informacion);
        if (this.length == 0) {
            this.origen = nuevo;
        } else {
            Nodo aux = this.iterator();
            while (aux.siguiente() != null) {
                aux = aux.siguiente();
            }
            aux.setSiguiente(nuevo);
        }
        length++;
    }

    @Override
    public void remove(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeFirst() {
        if (this.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            Nodo aux = this.origen;
            this.origen = aux.siguiente();
            aux.setSiguiente(null);
            aux = null;
            this.length--;
        }
    }

    @Override
    public void removeLast() {
        if (this.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            Nodo aux = this.iterator();
            while (aux.siguiente().siguiente() != null) {
                aux = aux.siguiente();
            }
            Nodo eliminar = aux.siguiente();
            aux.setSiguiente(null);
            eliminar.setSiguiente(null);
            eliminar = null;
            this.length--;
        }
    }

    @Override
    public int size() {
        return this.length;
    }

    @Override
    public boolean isEmpty() {
        return this.origen == null;
    }

    @Override
    public Nodo iterator() {
        return this.origen;
    }

    @Override
    public Nodo search(String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Nodo get(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void set(int posicion, Object informacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printList() {
        if (!this.isEmpty()) {
            Nodo aux = this.origen;
            do {
                System.out.print("[" + aux.getInfo().toString() + ", " + aux + "]-->");
                aux = aux.siguiente();
            } while (aux != null);
        } else {
            System.out.println("La lista está vacía");
        }
    }

}
