package tree.classes;

import java.util.Optional;
import tree.interfaces.TreeMethods;

public class Tree implements TreeMethods {

    Nodo root;

    @Override
    public void add(int i, Object info) {
        Nodo nuevo = new Nodo(i, info);
        if (root == null) {
            root = nuevo;
        } else {
            Nodo aux = root;
            while (aux != null) {
                nuevo.setParent(aux);
                if (nuevo.getKey() >= aux.getKey()) {
                    aux = aux.getRight();
                } else {
                    aux = aux.getLeft();
                }
            }
            if (nuevo.getKey() < nuevo.getParent().getKey()) {
                nuevo.getParent().setLeft(nuevo);
            } else {
                nuevo.getParent().setRight(nuevo);
            }
        }
    }
    
    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Nodo addRecursive(Nodo current, int key) {

        if (current == null) {
            return new Nodo(key, key);
        }

        if (key < current.getKey()) {
            current.setLeft(addRecursive(current.getLeft(), key));
        } else if (key > current.getKey()) {
            current.setRight(addRecursive(current.getRight(), key));
        }

        return current;
    }

    @Override
    public boolean remove(int key) {
        Nodo aux = this.iterator();
        boolean isLeft = true;
        while (aux.getKey() != key) {
            if (key < aux.getKey()) {
                isLeft = true;
                aux = aux.getLeft();
            } else {
                isLeft = false;
                aux = aux.getRight();
            }
            if (aux == null) {
                return false;
            }
        }
        if (aux.getLeft() == null && aux.getRight() == null) {
            Nodo parent = aux.getParent();
            if (aux == this.root) {
                this.root = null;
            } else if (isLeft && parent != null) {
                parent.setLeft(null);
            } else if (parent != null) {
                parent.setRight(null);
            }
        } else if (aux.getRight() == null) {
            Nodo parent = aux.getParent();
            if (aux == this.root) {
                this.root = aux.getLeft();
            } else if (isLeft && parent != null) {
                parent.setLeft(aux.getLeft());
            } else if (parent != null) {
                parent.setRight(aux.getLeft());
            }
        } else if (aux.getLeft() == null) {
            Nodo parent = aux.getParent();
            if (aux == this.root) {
                this.root = aux.getRight();
            } else if (isLeft && parent != null) {
                parent.setLeft(aux.getRight());
            } else if (parent != null) {
                parent.setRight(aux.getLeft());
            }
        } else {
            Nodo set = getNewNodo(aux);
            Nodo parent = aux.getParent();
            if (aux == this.root) {
                this.root = set;
            } else if (isLeft && parent != null) {
                parent.setLeft(set);
            } else if (parent != null) {
                parent.setRight(set);
            }
            set.setLeft(aux.getLeft());
        }
        return true;
    }

    public Nodo getNewNodo(Nodo removed) {
        Nodo parent = removed;
        Nodo set = removed;
        Nodo aux = removed.getRight();
        while (aux != null) {
            parent = removed;
            set = aux;
            aux = aux.getLeft();
        }
        if (set != removed.getRight()) {
            parent.setLeft(set.getRight());
            set.setRight(removed.getRight());
        }
        System.out.println(set.getKey() + "-" + set.getInfo().toString());
        return set;
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private Nodo deleteRecursive(Nodo current, int value) {
        if (current == null) {
            return null;
        }
        if (value == current.getKey()) {
            // Case 1: no children
            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            }
            // Case 2: only 1 child
            if (current.getRight() == null) {
                return current.getLeft();
            }

            if (current.getLeft() == null) {
                return current.getRight();
            }
            // Case 3: 2 children
            int smallestValue = findSmallestValue(current.getRight());
            current.setKey(smallestValue);
            current.setRight(deleteRecursive(current.getRight(), smallestValue));
            return current;
        }
        if (value < current.getKey()) {
            current.setLeft(deleteRecursive(current.getLeft(), value));
            return current;
        }
        current.setRight(deleteRecursive(current.getRight(), value));
        return current;
    }

    private int findSmallestValue(Nodo root) {
        return root.getLeft() == null ? root.getKey() : findSmallestValue(root.getLeft());
    }

    @Override
    public int size() {
        return getSizeRecursive(this.root);
    }

    private int getSizeRecursive(Nodo current) {
        return current == null ? 0 : getSizeRecursive(current.getLeft()) + 1 + getSizeRecursive(current.getRight());
    }

    @Override
    public boolean isEmpty() {
        return this.root == null;
    }

    @Override
    public Nodo iterator() {
        return this.root;
    }

    @Override
    public boolean exists(int key) {
        return exists(this.root, key);
    }

    @Override
    public boolean exists(Nodo n, int key) {
        if (n == null) {
            return false;
        }
        if (n.getKey() == key) {
            return true;
        } else if (key < n.getKey()) {
            return exists(n.getLeft(), key);
        } else {
            return exists(n.getRight(), key);
        }
    }

    @Override
    public Optional<Object> find(Integer value) {
        return this.root.find(value);
    }

    @Override
    public void inOrder(Nodo n) { //inOrder
        if (n != null) {
            inOrder(n.getLeft());
            System.out.print("[" + n.getKey() + ", " + n.getInfo().toString() + "]->");
            inOrder(n.getRight());
        }
    }

    @Override
    public void postOrder(Nodo n) {//
        if (n != null) {
            postOrder(n.getLeft());
            postOrder(n.getRight());
            System.out.print("[" + n.getKey() + ", " + n.getInfo().toString() + "]->");
        }
    }

    @Override
    public void preOrder(Nodo n) {
        if (n != null) {
            System.out.print("[" + n.getKey() + ", " + n.getInfo().toString() + "]->");
            postOrder(n.getLeft());
            postOrder(n.getRight());
        }
    }

}
