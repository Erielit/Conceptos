package pilas.interfaces;

import pilas.clases.Nodo;


public interface StackMethods {
    public boolean isEmpty();
    public int size();
    public void push(Object info);
    public void pop();
    public Object peek();
    public Nodo search(String param);
}
