package tree.interfaces;

import java.util.Optional;
import tree.classes.Nodo;

public interface TreeMethods {

    public void add(int i, Object info);
    public boolean remove(int key);
    public int size();
    public boolean isEmpty();
    public Nodo iterator();
    public boolean exists(int key);
    public boolean exists(Nodo n,int key);
    public Optional<Object> find(Integer key);
    public void inOrder(Nodo n);
    public void postOrder(Nodo n);
    public void preOrder(Nodo n);
}
