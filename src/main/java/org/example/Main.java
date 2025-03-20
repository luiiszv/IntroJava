package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la tarea a realizar:");
        System.out.println("1: Promedio de Edades \n2: Moda \n3: Desviación estándar");
        int option = scanner.nextInt();
        int[] edades = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la edad " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }

        if (option == 1) {
            System.out.println("El Promedio de edades es: " + calcularPromedio(edades));

        } else if (option == 2) {
            System.out.println(calcularModa(edades) != -1 ? "Moda: " + calcularModa(edades) : "No hay moda.");

        }
        else if (option == 3) {
            System.out.println("Desviación estándar: " + calcularDesviacion(edades));


        }
        else {
            System.out.println("Op No valida");

        }

    }


    public static double calcularPromedio(int[] edades) {
        int suma = 0;
        for (int edad : edades) {
            suma += edad;
        }
        return (double) suma / edades.length;
    }


    public static int calcularModa(int[] edades) {
        int moda = -1, maxFrecuencia = 0;

        for (int i = 0; i < edades.length; i++) {
            int frecuencia = 0;
            for (int j = 0; j < edades.length; j++) {
                if (edades[i] == edades[j]) frecuencia++;
            }
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = edades[i];
            }
        }
        return maxFrecuencia > 1 ? moda : -1; // Si no hay repetidos, devuelve -1
    }

    public static double calcularDesviacion(int[] edades) {
        int n = edades.length;
        double suma = 0, sumaCuadrados = 0;

        for (int edad : edades) suma += edad;
        double promedio = suma / n;

        for (int edad : edades) sumaCuadrados += Math.pow(edad - promedio, 2);

        return Math.sqrt(sumaCuadrados / n);
    }


}
