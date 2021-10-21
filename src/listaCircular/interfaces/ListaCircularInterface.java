package listaCircular.interfaces;

import listaCircular.clases.Nodo;

public interface ListaCircularInterface {

    public void add(int posicion, Object info);

    public void addFirst(Object info);

    public void addLast(Object info);

    public void remove(int posicion);

    public void removeFirst();

    public void removeLast();

    public int size();

    public boolean isEmpty();

    public Nodo iterator();

    public Nodo search(String buscar);

    public Nodo get(int posicion);

    public void set(int posicion, Object info);

    public void printList();
}
