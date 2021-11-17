package colas;

import colas.clases.Queue;

public class Test {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.put("Mike");
        q.put("Angel");
        q.put("Sara");
        q.put("Michelle");
        System.out.println("Size: " + q.size());
        System.out.println("Vacía: " + q.isEmpty());
        q.print();
        q.offer();
        System.out.println("==================================");
        q.print();
        q.put("Moreno");
        System.out.println("==================================");
        q.print();
    }
}
