package Nivel_2;

import java.util.Scanner;

import Nivel_2.Funciones_Nivel_2.Funciones;



    public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("     ANALIZADOR PROFESIONAL DE NÚMEROS");
        System.out.println("=======================================");

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        System.out.println("\n========= RESULTADOS =========");

        // Par o impar
        if (Funciones.esPar(numero)) {
            System.out.println("• El número es PAR.");
        } else {
            System.out.println("• El número es IMPAR.");
        }

        // Numeros 
        if (Funciones.esPrimo(numero)) {
            System.out.println("• El número es PRIMO.");
        } else {
            System.out.println("• El número NO es primo.");
        }

        // Numeros Perfectos
        if (Funciones.esPerfecto(numero)) {
            System.out.println("• El número es PERFECTO.");
        } else {
            System.out.println("• El número NO es perfecto.");
        }

        // Numeros Palíndromos
        if (Funciones.esPalindromo(numero)) {
            System.out.println("• El número es PALÍNDROMO.");
        } else {
            System.out.println("• El número NO es palíndromo.");
        }

        System.out.println("==============================");

        scanner.close();
    }
    }