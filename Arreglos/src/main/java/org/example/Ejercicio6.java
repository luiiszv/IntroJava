package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];
        int[] numerosInvertidos = new int[n];

        // Leer los números
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Invertir el arreglo
        for (int i = 0; i < n; i++) {
            numerosInvertidos[i] = numeros[n - 1 - i];
        }

        // Imprimir resultados
        System.out.println("Números ingresados: " + Arrays.toString(numeros));
        System.out.println("Arreglo invertido: " + Arrays.toString(numerosInvertidos));
    }
}
