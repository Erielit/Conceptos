package tree.classes;

import java.util.Optional;

public class Nodo {

    private Nodo parent;
    private Nodo right;
    private Nodo left;
    private int key;
    private Object info;

    public Nodo() {
    }

    public Nodo(int key, Object info) {
        this.parent = null;
        this.right = null;
        this.left = null;
        this.key = key;
        this.info = info;
    }

    public Nodo getParent() {
        return parent;
    }

    public void setParent(Nodo parent) {
        this.parent = parent;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Optional<Object> find(Integer value) {
        if (value == this.key) {
            return Optional.of(this.getInfo());
        } else if (value < this.key) {
            if (this.left != null) {
                return this.left.find(value);
            } else {
                return null;
            }
        } else {
            if (this.right != null) {
                return this.right.find(value);
            } else {
                return null;
            }
        }
    }

}
