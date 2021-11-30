package tree;

import tree.classes.Tree;

public class Test {

    public static void main(String[] args) {

        Tree t = new Tree();
//        t.add(4);
//        t.add(8);
//        t.add(1);
//        t.add(9);
//        t.add(7);
        t.add(4, "Naranja");
        t.add(8, "Manzana");
        t.add(1, "Uva");
        t.add(9, "Sandia");
        t.add(7, "Pera");
        t.inOrder(t.iterator());
//        System.out.println("===========================");
//        t.postOrder(t.iterator());
//        System.out.println("===========================");
//        t.preOrder(t.iterator());
        System.out.println("\n===========================");
//        System.out.println(t.remove(9));
        System.out.println(t.remove(9));
        System.out.println("\n===========================");
        t.inOrder(t.iterator());
        System.out.println("\n===========================");
        System.out.println(t.size());
    }
}
