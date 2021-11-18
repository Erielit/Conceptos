package colas.interfaces;

import colas.clases.Nodo;

public interface QueueMethods {

    public void add(Object info);

    public Object poll();

    public boolean isEmpty();

    public int size();

    public Object search(String param);

    public Nodo iterator();
    
    public Object peek();

    public void print();
}
