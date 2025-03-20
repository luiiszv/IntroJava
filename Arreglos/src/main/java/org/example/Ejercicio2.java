package org.example;

public class Ejercicio2 {

    public static void ejecutar() {
        int[] numerosPares = new int[100];


        for (int i = 0; i < 100; i++) {
            numerosPares[i] = (i + 1) * 2;
        }

        // a) Imprimir en una sola línea
        System.out.println("Ejercicio 2 - Primeros 100 números pares en una sola línea:");
        for (int num : numerosPares) {
            System.out.print(num + " ");
        }
        System.out.println("\n--------------------------------------");

        // b) Imprimir en 10 líneas con número de línea
        System.out.println("Ejercicio 2 - Primeros 100 números pares en 10 líneas:");
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.print("\nLínea " + (i / 10 + 1) + ": ");
            }
            System.out.print(numerosPares[i] + " ");
        }
        System.out.println("\n--------------------------------------");
    }
}
