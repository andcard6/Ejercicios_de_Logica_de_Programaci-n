/*
 * Ejercicios de Lógica de Programación - Progresivo 
 * Autor: Andrés Felipe Henao
 * Fecha: 20/03/2026
 * NIVEL 1
 */

import static Ejercicios.Funciones.*;
import java.util.ArrayList;

public class Operaciones {
    public static void main(String[] args) {
        int opcion; 
        do {
            opcion = menu();
            switch (opcion) {
                // Calculadora básica 

                case 1:
                    System.out.println("Resultado: " + suma(leerEntero("Ingrese numero 1: "), 
                            leerEntero("Ingrese numero 2: ")));
                    break;
                case 2:
                    System.out.println("Resultado: " + resta(leerEntero("Ingrese numero 1: "), 
                            leerEntero("Ingrese numero 2: ")));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicacion(leerEntero("Ingrese numero 1: "), 
                            leerEntero("Ingrese numero 2: ")));
                    break;
                case 4:
                    double resultadoDiv = division(leerEntero("Ingrese numero 1: "), 
                            leerEntero("Ingrese numero 2: "));
                    if (!Double.isNaN(resultadoDiv)) {
                        System.out.println("Resultado: " + resultadoDiv);
                    }
                    break;
                case 5:
                    System.out.println("Resultado: " + potencia(leerDecimal("Base: "), 
                            leerDecimal("Exponente: ")));
                    break;
                case 6:
                    double num = leerDecimal("Número: ");
                    double resultadoRaiz = raiz(num);
                    if (!Double.isNaN(resultadoRaiz)) {
                        System.out.println("Resultado: " + resultadoRaiz);
                    } else {
                        System.out.println("ERROR: No se puede calcular raíz cuadrada de número negativo");
                    }
                    break;
                case 7:
                    mayormenor(leerEntero("Ingrese numero 1: "), 
                            leerEntero("Ingrese numero 2: "));
                    break;
                case 8:
                    System.out.println("Número invertido: " + numinvertido(leerEntero("Número: ")));
                    break;
                case 9:
                    System.out.println("Resultado: " + logaritmo(leerDecimal("Número positivo: ")));
                    break;
                
                // Validador de números

                case 10:
                    int numero = leerEntero("Ingrese un número: ");
                    System.out.println(numero + (esPar(numero) ? " es par" : " es impar"));
                    break;
                case 11:
                    numero = leerEntero("Ingrese un número: ");
                    System.out.println(numero + (esPrimo(numero) ? " es primo" : " no es primo"));
                    break;
                case 12:
                    numero = leerEntero("Ingrese un número: ");
                    System.out.println(numero + (esPerfecto(numero) ? " es perfecto" : " no es perfecto"));
                    break;
                case 13:
                    numero = leerEntero("Ingrese un número: ");
                    System.out.println(numero + (esPalindromoNumero(numero) ? " es palíndromo" : " no es palíndromo"));
                    break;
                
                // Manipulación de cadenas

                case 14:
                    String cadena = leerCadena("Ingrese una cadena: ");
                    contarVocalesConsonantes(cadena);
                    break;
                case 15:
                    cadena = leerCadena("Ingrese una cadena: ");
                    System.out.println("Cadena invertida: " + invertirCadena(cadena));
                    break;
                case 16:
                    cadena = leerCadena("Ingrese una cadena: ");
                    System.out.println("¿Es palíndromo? " + (esPalindromoCadena(cadena) ? "Sí" : "No"));
                    break;
                case 17:
                    String frase = leerCadena("Ingrese una frase: ");
                    System.out.println("Número de palabras: " + contarPalabras(frase));
                    break;
                
                // Operaciones con listas

                case 18:
                    ArrayList<Integer> lista = ingresarLista();
                    mayorMenorLista(lista);
                    break;
                case 19:
                    lista = ingresarLista();
                    System.out.println("Promedio: " + calcularPromedio(lista));
                    break;
                case 20:
                    lista = ingresarLista();
                    ArrayList<Integer> sinDuplicados = eliminarDuplicados(lista);
                    System.out.println("Lista sin duplicados: " + sinDuplicados);
                    break;
                case 21:
                    lista = ingresarLista();
                    bubbleSort(lista);
                    System.out.println("Lista ordenada: " + lista);
                    break;
                
                // Conversores de unidades
                case 22:
                    conversorTemperatura();
                    break;
                case 23:
                    conversorLongitud();
                    break;
                case 24:
                    conversorPeso();
                    break;
                case 25:
                    conversorTiempo();
                    break;
                
                case 0:
                    System.out.println("Gracias por usar la calculadora.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            
            if (opcion != 0) {
                contadorRegresivo(3);
            }

            System.out.println();
        } while (opcion != 0);
    }
}