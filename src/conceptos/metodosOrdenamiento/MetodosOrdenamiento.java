/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos.metodosOrdenamiento;

/**
 *
 * @author netmo
 */
public class MetodosOrdenamiento {

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3, 6, 8, 45, 67, 879, 23};
        quicksort2(arr, 0, arr.length - 1);
        print(arr);
    }

    public static void quicksort(int A[], int izq, int der) {

        int pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {                          // mientras no se crucen las búsquedas                                   
            while (A[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
                j--;           // busca elemento menor que pivote
            }
            if (i < j) {                        // si no se han cruzado                      
                aux = A[i];                      // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        A[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1) {
            quicksort(A, izq, j - 1);          // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(A, j + 1, der);          // ordenamos subarray derecho
        }
    }

    public static void quicksort2(int[] arr, int first, int last) {
        int i, j, pivote, aux;
        i = first;
        j = last;
        pivote = arr[(first + last) / 2];
        do {
            while (arr[i] < pivote) {
                i++;
            }
            while (arr[j] > pivote) {
                j--;
            }
            if (i <= j) {
                aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (first < j) {
            quicksort2(arr, first, j);
        }
        if (i < last) {
            quicksort2(arr, i, last);
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print("[" + i + "]");
        }
        System.out.println("");
    }
}
