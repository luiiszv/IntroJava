package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad de números
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];
        long[] factoriales = new long[n];

        // Leer los números y calcular sus factoriales
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            factoriales[i] = calcularFactorial(numeros[i]);
        }

        // Imprimir los arreglos
        System.out.println("Números ingresados: " + Arrays.toString(numeros));
        System.out.println("Factoriales: " + Arrays.toString(factoriales));
    }

    // Método para calcular el factorial de un número
    private static long calcularFactorial(int num) {
        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}