
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" **************************BIENVENIDO A ESTRUCTURAS DE DATOS********************");
        System.out.print("                  DIGITE LA CANTIDAD DE NUMEROS A GENERAR: ");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int [] array = new int [n];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n);
        }
        System.out.print("ARREGLO: ");
        if(array.length > 15) {
            for(int i = 0; i < 15; i++) {
                System.out.print(array[i]+", ");
            }
        } else {
            for(int i = 0; i < array.length; i++) {
                System.out.print(array[i]+", ");
            }
        }
        int [] array3 = array;
        System.out.println();
        System.out.println("_________________________________________________________________________________________");
        System.out.println("*|Heap Sort|*");
        HeapSort nuevo3 = new HeapSort();
        double tiempoInicio3 = System.currentTimeMillis();
        nuevo3.sort(array3);
        double tiempoFinal3 = System.currentTimeMillis() - tiempoInicio3 ;
        System.out.println("---> |Tiempo: "+ tiempoFinal3 +" Milisegundos|");
    }
}
