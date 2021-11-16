/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.listaEnlazada;

import java.util.Scanner;
import listas.listaDobleEnlazada.clases.Elefante;
import listas.listaEnlazada.clases.ListaEnlazada;

/**
 *
 * @author netmo
 */
public class Test {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        String posicion = "";
        String precio = "", cantidad = "";
        String nombreProducto = "", opc = "";
        Elefante bean = null;
        ListaEnlazada lista = new ListaEnlazada();
        do {
            System.out.println("");
            System.out.println("Lista Enlazada");
            System.out.println("1. Agregar al inicio");
            System.out.println("2. Agregar al final");
            System.out.println("3. Imprimir lista");
            System.out.println("4. Tamaño de la lista");
            System.out.println("5. Lista es vacía");
            System.out.println("6.- Eliminar el primero");
            System.out.println("7.- Eliminar el último");
            System.out.println("8.- Obtener con posición");
            System.out.println("9.- Buscar elefante");
            System.out.println("10. Insertar con posición");
            System.out.println("11. Eliminar con posición");
            System.out.println("12. Remplazo con posición");
            System.out.println("13. Salir");
            System.out.println("Selecciona una opción");
            opc = leer.next();
            if (isNumeric(opc)) {
                switch (isNumeric2(opc)) {
                    case 1:
                        System.out.print("Ingrese nombre del elefante :> ");
                        nombreProducto = leer.next();
                        System.out.print("Ingrese edad :> ");
                        do {
                            precio = leer.next();
                            if (!isNumeric(precio)) {
                                System.out.println("Ingrese una edad válida");
                            }
                        } while (!isNumeric(precio));
                        System.out.print("Ingrese estatura del elefante :> ");
                        do {
                            cantidad = leer.next();
                            if (!isDouble(cantidad)) {
                                System.out.println("Ingrese un número válido");
                            }
                        } while (!isDouble(cantidad) && isNumeric2(precio) > 0);
                        bean = new Elefante(nombreProducto, isNumeric2(precio), isNumeric2(cantidad));
                        lista.addFirst(bean);
                        break;
                    case 2:
                        System.out.print("Ingrese nombre del elefante :> ");
                        nombreProducto = leer.next();
                        System.out.print("Ingrese edad :> ");
                        do {
                            precio = leer.next();
                            if (!isNumeric(precio)) {
                                System.out.println("Ingrese una edad válida");
                            }
                        } while (!isNumeric(precio));
                        System.out.print("Ingrese estatura del elefante :> ");
                        do {
                            cantidad = leer.next();
                            if (!isDouble(cantidad)) {
                                System.out.println("Ingrese un número válido");
                            }
                        } while (!isDouble(cantidad) && isNumeric2(precio) > 0);
                        bean = new Elefante(nombreProducto, isNumeric2(precio), isNumeric2(cantidad));
                        lista.addLast(bean);
                        break;
                    case 3:
                        lista.printList();
                        break;
                    case 4:
                        System.out.println("Length:> " + lista.size());
                    case 5:
                        System.out.println("Vacía:> " + lista.isEmpty());
                        break;
                    case 6:
                        if (!lista.isEmpty()) {
                            lista.removeFirst();
                        } else {
                            System.out.println("La lista está vacía");
                        }
                        break;
                    case 7:
                        if (!lista.isEmpty()) {
                            lista.removeLast();
                        } else {
                            System.out.println("La lista está vacía");
                        }
                        break;

                    default:
                        System.out.println("Opción no encontrada");
                }
            }
        } while (isNumeric2(opc) != 13);

    }

    public static boolean isNumeric(String numero) {
        try {
            int num = Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static int isNumeric2(String numero) {
        int num = 0;
        try {
            num = Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            return num;
        }
        return num;
    }

    public static boolean isDouble(String numero) {
        try {
            double num = Double.parseDouble(numero);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
