package listas.listaCircular.test;

import java.util.Iterator;
import java.util.LinkedList;
import listas.listaCircular.clases.Elefante;
import listas.listaCircular.clases.ListaCircular;

public class ListaSC {

    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        lista.addFirst(new Elefante("Dumbo", 20, 2.6));
        lista.addFirst(new Elefante("Elefante", 15, 2.9));
        lista.addLast(new Elefante("Tantor", 15, 2.9));
        lista.printList();
        System.out.println("");

    }

}
