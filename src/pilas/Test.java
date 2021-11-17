package pilas;

import java.util.Scanner;
import pilas.clases.Nodo;
import pilas.clases.Stack;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        Stack stack = new Stack();
        int opcion = 0;
        do {
            System.out.println("Menú");
            System.out.println("1. Pila vacía");
            System.out.println("2. Tamaño pila");
            System.out.println("3. Apilar");
            System.out.println("4. Quitar");
            System.out.println("5. Pico");
            System.out.println("6. Buscar");
            System.out.println("7. Imprimir");
            System.out.println("8. Salir...");
            System.out.println("Seleccionar...");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Pila vacía: " + stack.isEmpty());
                    break;
                case 2:
                    System.out.println("Tamaño pila: " + stack.size());
                    break;
                case 3:
                    System.out.println("Apilar elemento");
                    System.out.println("Ingresar palabra");
                    stack.push(sc.next());
                    break;
                case 4:
                    System.out.println("Quitar elemento");
                    stack.pop();
                    break;
                case 5:
                    System.out.println("Mostrar pico de la pila");
                    System.out.println("[" + stack.peek().getInformation().toString() + "]");
                    break;
                case 6:
                    System.out.println("Buscar por palabra");
                    Nodo found = null;
                    System.out.println("Ingresar palabra");
                    found = stack.search(sc.next());
                    if (found == null) {
                        System.out.println("Palabra no encontrada");
                    } else {
                        System.out.println("[" + found.getInformation().toString() + "]");
                    }
                    break;
                case 7:
                    if (stack.isEmpty()) {
                        System.out.println("Pila vacía");
                    } else {
                        stack.print();
                    }
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion != 8);

    }
}
