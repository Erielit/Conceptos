/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos.metodosBusqueda;

/**
 *
 * @author netmo
 */
public class MetodosBusqueda {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        busquedaBinaria(arr, 9);
    }

    public static int busquedaSecuencial(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {//recorremos todo el arreglo
            if (arr[i] == num) {//comparamos el elemento en el arreglo con el buscado
                return i;
            }
        }
        return -1;
    }

    public static void busquedaBinaria(int[] arr, int num) {
        boolean error = true;
        int first = 0, centro = 0;
        int last = arr.length - 1;
        while (first <= last) {
            centro = (first + last) / 2;
            if (arr[centro] == num) {
                System.out.println("Número enontrado: " + num 
                        + ", con posición: " + centro);
                error = false;
                break;
            } else if (num < arr[centro]) {
                last = centro - 1;
            } else {
                first = centro + 1;
            }
        }
        if (error) {
            System.out.println("El número no se encontró");
        }
    }
}
