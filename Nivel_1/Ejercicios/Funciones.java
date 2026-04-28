/*
 * Ejercicios de Lógica de Programación
 * Autor: Andrés Felipe Henao
 * NIVEL 1 - Calculadora Básica
 */

package Ejercicios;

import java.util.Scanner;

public class Funciones {

    private static Scanner sc = new Scanner(System.in);

    // ================= MENÚ =================
    public static int menu() {
        System.out.println("\n========== CALCULADORA BÁSICA ==========");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz cuadrada");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        return sc.nextInt();
    }

    // ================= LECTURA DE DATOS =================
    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static double leerDecimal(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    // ================= OPERACIONES BÁSICAS =================

    // Suma
    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    // Resta
    public static int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    // Multiplicación
    public static int multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    // División con validación
    public static double division(int numero1, int numero2) {
        if (numero2 == 0) {
            System.out.println("ERROR: No se puede dividir por cero.");
            return Double.NaN;
        }

        return (double) numero1 / numero2;
    }

    // ================= OPERACIONES AVANZADAS =================

    // Potencia
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Raíz cuadrada con validación
    public static double raizCuadrada(double numero) {
        if (numero < 0) {
            System.out.println("ERROR: No se puede calcular la raíz cuadrada de un número negativo.");
            return Double.NaN;
        }

        return Math.sqrt(numero);
    }

    // ================= CONTADOR REGRESIVO =================
    public static void contadorRegresivo(int segundos) {
        System.out.print("\nVolviendo al menú en: ");

        for (int i = segundos; i >= 1; i--) {
            System.out.print(i + " ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("\nERROR: Interrupción en el contador.");
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\n");
    }
}
