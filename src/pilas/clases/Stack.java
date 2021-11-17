package pilas.clases;

import pilas.interfaces.StackMethods;

public class Stack implements StackMethods {

    Nodo top;
    int size;

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void push(Object info) {
        Nodo nuevo = new Nodo(info);
        // Consulta si la pila esta vacia.
        if (this.isEmpty()) {
            // Inicializa la pila con el nuevo valor.
            top = nuevo;
        } // Caso contrario agrega el nuevo nodo al inicio de la pila.
        else {
            nuevo.setSiguiente(top);
            top = nuevo;
        }
        // Incrementa el contador del tamaño.
        size++;
    }

    @Override
    public void pop() {
        if (!this.isEmpty()) {
            // Asigna como primer nodo al siguiente de la pila.
            this.top = this.top.siguiente();
            // Decrementa el contador del tamaño de la pila
            this.size--;
        }
    }

    @Override
    public Nodo peek() {
        return this.top;
    }

    @Override
    public Nodo iterator() {
        return this.top;
    }

    @Override
    public Nodo search(String param) {
        Nodo found = null;
        if (this.isEmpty()) {
            new Exception("Erorr");
        } else {
            Nodo aux = this.iterator();
            do {
                if (aux.getInformation().toString().equals(param)) {
                    found = aux;
                    break;
                }
                aux = aux.siguiente();
            } while (aux != null);
        }
        return found;
    }

    @Override
    public void print() {
        Nodo aux = this.iterator();
        do {
            System.out.println("[" + aux.getInformation() + "," + aux + "]");
            aux = aux.siguiente();
        } while (aux != null);
    }
}
