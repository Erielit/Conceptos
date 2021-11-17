package pilas.interfaces;

import pilas.clases.Nodo;


public interface StackMethods {
    public boolean isEmpty();
    public int size();
    public void push(Object info);
    public void pop();
    public Nodo peek();
    public Nodo search(String param);
    public Nodo iterator();
    public void print();
}
