/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Nodo;

/**
 *
 * @author CC7
 */
public interface ListaDEOperaciones {

    public void add(int posicion, Object info);

    public void addFirst(Object info);

    public void addLast(Object informacion);

    public void remove(int posicion);

    public void removeFirst();

    public void removeLast();

    public int size();

    public boolean isEmpty();

    public Nodo iteratorOrigen();

    public Nodo iteratorFinal();

    public Nodo search(String buscar);

    public Nodo get(int posicion);

    public void set(int posicion, Object informacion);

    public void printList();
}
