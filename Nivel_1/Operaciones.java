/*
 * Ejercicios de Lógica de Programación - Progresivo
 * Autor: Andrés Felipe Henao
 * Fecha: 20/03/2026
 * NIVEL 1 - Calculadora Básica
 */

import static Ejercicios.Funciones.*;

public class Operaciones {

    public static void main(String[] args) {

        int opcion;

        do {
            opcion = menu();

            switch (opcion) {

                // ================= SUMA =================
                case 1:
                    System.out.println("Resultado: " +
                            suma(
                                    leerEntero("Ingrese número 1: "),
                                    leerEntero("Ingrese número 2: ")
                            ));
                    break;

                // ================= RESTA =================
                case 2:
                    System.out.println("Resultado: " +
                            resta(
                                    leerEntero("Ingrese número 1: "),
                                    leerEntero("Ingrese número 2: ")
                            ));
                    break;

                // ================= MULTIPLICACIÓN =================
                case 3:
                    System.out.println("Resultado: " +
                            multiplicacion(
                                    leerEntero("Ingrese número 1: "),
                                    leerEntero("Ingrese número 2: ")
                            ));
                    break;

                // ================= DIVISIÓN =================
                case 4:
                    double resultadoDivision = division(
                            leerEntero("Ingrese dividendo: "),
                            leerEntero("Ingrese divisor: ")
                    );

                    if (!Double.isNaN(resultadoDivision)) {
                        System.out.println("Resultado: " + resultadoDivision);
                    }
                    break;

                // ================= POTENCIA =================
                case 5:
                    System.out.println("Resultado: " +
                            potencia(
                                    leerDecimal("Ingrese la base: "),
                                    leerDecimal("Ingrese el exponente: ")
                            ));
                    break;

                // ================= RAÍZ CUADRADA =================
                case 6:
                    double numero = leerDecimal("Ingrese el número: ");

                    double resultadoRaiz = raizCuadrada(numero);

                    if (!Double.isNaN(resultadoRaiz)) {
                        System.out.println("Resultado: " + resultadoRaiz);
                    }
                    break;

                // ================= SALIR =================
                case 0:
                    System.out.println("Gracias por usar la calculadora.");
                    break;

                // ================= ERROR =================
                default:
                    System.out.println("ERROR: Opción no válida.");
                    break;
            }

            // Regreso automático al menú
            if (opcion != 0) {
                contadorRegresivo(3);
            }

            System.out.println();

        } while (opcion != 0);
    }
}
