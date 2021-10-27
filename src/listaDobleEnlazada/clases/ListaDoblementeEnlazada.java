/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaDobleEnlazada.clases;

import listaDobleEnlazada.interfaces.ListaDEOperaciones;

/**
 *
 * @author CC7
 */
public class ListaDoblementeEnlazada implements ListaDEOperaciones {

    Nodo nodoOrigin;
    Nodo nodoFinal;
    int size = 0;

    @Override
    public void add(int posicion, Object info) {
        Nodo nuevo = new Nodo(info);
        if (this.isEmpty()) {
            if (posicion == 0) {
                this.addFirst(info);
            } else {
                int auxPosicion = 1;
                Nodo aux = this.iteratorOrigen();
                while (auxPosicion != posicion) {
                    aux = aux.siguiente();
                    auxPosicion++;
                }
                Nodo despues = aux.siguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(despues);
                nuevo.setAntes(aux);
                despues.setAntes(nuevo);
            }
            size++;
        }
    }

    @Override
    public void addFirst(Object informacion) {
        Nodo nuevo = new Nodo(informacion);
        if (this.size == 0) {
            nodoOrigin = nuevo;
            nodoFinal = nuevo;
        } else {
            nodoOrigin.setAntes(nuevo);
            nuevo.setSiguiente(nodoOrigin);
            nodoOrigin = nuevo;
        }
        size++;
    }

    @Override
    public void addLast(Object informacion) {
        Nodo nuevo = new Nodo(informacion);
        if (this.size == 0) {
            nodoOrigin = nuevo;
            nodoFinal = nuevo;
        } else {
            Nodo aux = this.nodoFinal;
            aux.setSiguiente(nuevo);
            nuevo.setAntes(aux);
            nodoFinal = nuevo;
        }
        size++;
    }

    @Override
    public void remove(int posicion) {
        if (!this.isEmpty()) {
            if (posicion == 0) {
                this.removeFirst();
            } else if (posicion > 0 && posicion < this.size) {
                Nodo aux = this.iteratorOrigen();
                int auxPosicion = 0;
                while (auxPosicion != posicion) {
                    aux = aux.siguiente();
                    auxPosicion++;
                }
                aux.antes().setSiguiente(aux.siguiente());
                aux.setSiguiente(aux.siguiente());
                aux = null;
                size--;
            }
        }
    }

    @Override
    public void removeFirst() {
        if (this.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            Nodo aux = this.nodoOrigin;
            nodoOrigin = aux.siguiente();
            aux.setSiguiente(null);
            aux.setAntes(null);
            aux = null;
            size--;
        }

    }

    @Override
    public void removeLast() {
        if (this.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            if (this.size == 1) {
                this.removeFirst();
            } else {
                Nodo aux = this.iteratorFinal();
                nodoFinal = aux.antes();
                aux.setAntes(null);
                aux.setSiguiente(null);
                aux = null;
                size--;
            }

        }

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public Nodo iteratorOrigen() {
        return this.nodoOrigin;
    }

    @Override
    public Nodo iteratorFinal() {
        return this.nodoFinal;
    }

    @Override
    public Nodo search(String buscar) {
        Nodo aux = this.nodoOrigin;
        Nodo found = null;
        do {
            if (aux.getInfo().toString().contains(buscar)) {
                found = aux;
                break;
            }
            aux = aux.siguiente();
        } while (aux != null);
        return found;
    }

    @Override
    public Nodo get(int posicion) {
        Nodo oriNodo = null;
        if (posicion == 0) {
            return this.nodoOrigin;
        } else if (posicion > 0 && posicion < this.size) {
            Nodo aux = this.iteratorOrigen();
            int auxPosicion = 0;
            while (auxPosicion != posicion) {
                aux = aux.siguiente();
                auxPosicion++;
            }
            oriNodo = aux;
        }
        return oriNodo;
    }

    @Override
    public void set(int posicion, Object informacion) {
        Nodo remplazo = new Nodo(informacion);
        if (posicion == 0) {
            Nodo aux = this.nodoOrigin;
            remplazo.setSiguiente(aux.siguiente());
            aux.siguiente().setAntes(remplazo);
            nodoOrigin.setSiguiente(null);
            nodoOrigin = null;
            nodoOrigin = remplazo;
        } else if (posicion > 0 && posicion < this.size) {
            Nodo aux = this.iteratorOrigen();
            int auxPosicion = 0;
            while (auxPosicion != posicion) {
                aux = aux.siguiente();
                auxPosicion++;
            }
            remplazo.setAntes(aux.antes());
            remplazo.setSiguiente(aux.siguiente());
            aux.antes().setSiguiente(remplazo);
            if (aux.siguiente() != null) {
                aux.siguiente().setAntes(remplazo);
            }
        }
    }

    @Override
    public void printList() {
        if (!this.isEmpty()) {
            Nodo aux = this.nodoOrigin;
            do {
                System.out.print("[" + aux.getInfo().toString() + ", " + aux + "]-->");
                aux = aux.siguiente();
            } while (aux != null);
        } else {
            System.out.println("La lista está vacía");
        }

    }

}
