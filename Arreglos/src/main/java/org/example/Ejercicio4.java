package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        // Leer los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Encontrar el menor y el mayor
        int menor = numeros[0];
        int mayor = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        // Imprimir resultados
        System.out.println("Números ingresados: " + Arrays.toString(numeros));
        System.out.println("Número menor: " + menor);
        System.out.println("Número mayor: " + mayor);
    }

}
