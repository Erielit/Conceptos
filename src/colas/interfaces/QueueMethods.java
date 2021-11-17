package colas.interfaces;

import colas.clases.Nodo;

public interface QueueMethods {

    public void put(Object info);

    public Object offer();

    public boolean isEmpty();

    public int size();

    public Object search(String param);

    public Nodo iterator();

    public void print();
}
