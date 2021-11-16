package listas.listaDobleEnlazada.test;

import listas.listaDobleEnlazada.clases.Elefante;
import listas.listaDobleEnlazada.clases.ListaDoblementeEnlazada;
import listas.listaDobleEnlazada.clases.Nodo;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDE {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        String posicion = "";
        String precio = "", cantidad = "";
        String nombreProducto = "", opc = "";
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        Elefante bean = null;

        do {
            System.out.println("\nMenú");
            System.out.println("1. Insertar al principio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Imprimir Lista");
            System.out.println("4.- Saber el tamaño da la Lista");
            System.out.println("5.- Saber si la Lista esta vacia");
            System.out.println("6.- Eliminar el primero");
            System.out.println("7.- Eliminar el último");
            System.out.println("8.- Obtener con posición");
            System.out.println("9.- Buscar elefante");
            System.out.println("10. Insertar con posición");
            System.out.println("11. Eliminar con posición");
            System.out.println("12. Remplazo con posición");
            System.out.println("13. Salir");
            System.out.println("Selecciona una opción");
            do {
                opc = leer.next();
                if (!isNumeric(opc)) {
                    System.out.println("Ingrese una opción correcta");
                }
            } while (!isNumeric(opc));

            if (isNumeric(opc)) {
                int numero = isNumeric2(opc);
                switch (numero) {
                    case 1:
                        System.out.print("Ingrese nombre del elefante :> ");
                        nombreProducto = leer.next();
                        System.out.print("Ingrese edad :> ");
                        do {
                            precio = leer.next();
                            if (!isDouble(precio)) {
                                System.out.println("Ingrese una edad válida");
                            }
                        } while (!isDouble(precio));
                        System.out.print("Ingrese estatura del elefante :> ");
                        do {
                            cantidad = leer.next();
                            if (!isNumeric(cantidad)) {
                                System.out.println("Ingrese un número válido");
                            }
                        } while (!isNumeric(cantidad) && isNumeric2(precio) > 0);
                        bean = new Elefante(nombreProducto, isNumeric2(precio), isNumeric2(cantidad));
                        lista.addFirst(bean);
                        break;
                    case 2:
                        System.out.print("Ingrese nombre del elefante :> ");
                        nombreProducto = leer.next();
                        System.out.print("Ingrese edad :> ");
                        do {
                            precio = leer.next();
                            if (!isDouble(precio)) {
                                System.out.println("Ingrese una edad válida");
                            }
                        } while (!isDouble(precio));
                        System.out.print("Ingrese estatura del elefante:> ");
                        do {
                            cantidad = leer.next();
                            if (!isNumeric(cantidad)) {
                                System.out.println("Ingrese un número válido");
                            }
                        } while (!isNumeric(cantidad) && isNumeric2(precio) > 0);
                        bean = new Elefante(nombreProducto, isNumeric2(precio), isNumeric2(cantidad));
                        lista.addLast(bean);
                        break;
                    case 3:
                        if (!lista.isEmpty()) {
                            lista.printList();
                        } else {
                            System.out.println("La lista está vacía");
                        }
                        break;
                    case 4:
                        System.out.println("El tamaño de la lista es de: " + lista.size());
                        break;
                    case 5:
                        if (lista.isEmpty()) {
                            System.out.println("La Lista tiene elementos");
                        } else {
                            System.out.println("La Lista esta vacia");
                        }
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
                    case 8:
                        System.out.println("Ingrese una posición");
                        do {
                            posicion = leer.next();
                            if (!isNumeric(posicion)) {
                                System.out.println("Ingrese un número válido");
                            }
                        } while (!isNumeric(posicion));
                        Nodo aux2 = lista.get(isNumeric2(posicion));
                        System.out.println("HashCode:> " + aux2);
                        break;
                    case 9:
                        System.out.print("Ingrese parámetro para buscar ");
                        precio = leer.next();
                        
                        Nodo aux = lista.search(precio);
                        if (aux != null) {
                           System.out.println("HashCode:> " + aux); 
                        }else{
                            System.out.println("No encontrado");
                        }
                        
                        break;
                    case 10:
                        System.out.print("Ingrese nombre del elefante :> ");
                        nombreProducto = leer.next();
                        System.out.print("Ingrese edad :> ");
                        do {
                            precio = leer.next();
                            if (!isDouble(precio)) {
                                System.out.println("Ingrese una edad válida");
                            }
                        } while (!isDouble(precio));
                        System.out.print("Ingrese estatura del elefante:> ");
                        do {
                            cantidad = leer.next();
                            if (!isNumeric(cantidad)) {
                                System.out.println("Ingrese un número válido");
                            }
                        } while (!isNumeric(cantidad) && isNumeric2(precio) > 0);
                        System.out.print("Ingrese una posición:> ");
                        do {
                            posicion = leer.next();
                            if (!isNumeric(posicion)) {
                                System.out.println("Ingrese un número válido");
                            }
                        } while (!isNumeric(posicion));
                        bean = new Elefante(nombreProducto, isNumeric2(precio), isNumeric2(cantidad));
                        lista.add(isNumeric2(posicion), bean);
                        break;
                    case 11:
                        if (!lista.isEmpty()) {
                            System.out.print("Ingrese la posición a liminar:> ");
                            do {
                                posicion = leer.next();
                                if (!isNumeric(posicion)) {
                                    System.out.println("Ingrese un número válido");
                                }
                            } while (!isNumeric(posicion));
                            lista.remove(isNumeric2(posicion));
                        }
                        break;
                    case 12:
                        if (!lista.isEmpty()) {
                            System.out.print("Ingrese nombre del elefante :> ");
                            nombreProducto = leer.next();
                            System.out.print("Ingrese edad :> ");
                            do {
                                precio = leer.next();
                                if (!isDouble(precio)) {
                                    System.out.println("Ingrese una edad válida");
                                }
                            } while (!isDouble(precio));
                            System.out.print("Ingrese estatura del elefante:> ");
                            do {
                                cantidad = leer.next();
                                if (!isNumeric(cantidad)) {
                                    System.out.println("Ingrese un número válido");
                                }
                            } while (!isNumeric(cantidad) && isNumeric2(precio) > 0);
                            bean = new Elefante(nombreProducto, isNumeric2(precio), isNumeric2(cantidad));
                            System.out.print("Ingrese la posición a remplazar:> ");
                            do {
                                posicion = leer.next();
                                if (!isNumeric(posicion)) {
                                    System.out.println("Ingrese un número válido");
                                }
                            } while (!isNumeric(posicion));
                            lista.set(isNumeric2(posicion), bean);
                        }
                        break;
                    default:
                        System.out.println("Seleccione una opción correcta");
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
