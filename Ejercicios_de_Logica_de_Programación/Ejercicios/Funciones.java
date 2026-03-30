/*
 * Ejercicios de Lógica de Programación - Progresivo 
 * Autor: Andrés Felipe Henao
 * Fecha: 20/03/2026
 * NIVEL 1
 */

package Ejercicios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

public class Funciones {

    private static Scanner sc = new Scanner(System.in);

    public static int menu() {
        System.out.println("\n========== MENÚ PRINCIPAL ==========");
        System.out.println("===== CALCULADORA BÁSICA =====");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz cuadrada");
        System.out.println("7. Mayor y menor");
        System.out.println("8. Dígitos invertidos");
        System.out.println("9. Logaritmo");
        System.out.println("\n===== VALIDADOR DE NÚMEROS =====");
        System.out.println("10. Verificar si es Par o Impar");
        System.out.println("11. Verificar si es Primo");
        System.out.println("12. Verificar si es Perfecto");
        System.out.println("13. Verificar si es Palíndromo (número)");
        System.out.println("\n===== MANIPULACIÓN DE CADENAS =====");
        System.out.println("14. Contar vocales y consonantes");
        System.out.println("15. Invertir cadena");
        System.out.println("16. Verificar si es palíndromo (cadena)");
        System.out.println("17. Contar palabras en una frase");
        System.out.println("\n===== OPERACIONES CON LISTAS =====");
        System.out.println("18. Encontrar mayor y menor elemento");
        System.out.println("19. Calcular promedio");
        System.out.println("20. Eliminar duplicados");
        System.out.println("21. Ordenar lista (Bubble Sort)");
        System.out.println("\n===== CONVERSOR DE UNIDADES =====");
        System.out.println("22. Conversor de Temperatura");
        System.out.println("23. Conversor de Longitud");
        System.out.println("24. Conversor de Peso");
        System.out.println("25. Conversor de Tiempo");
        System.out.println("\n0. Salir");
        System.out.print("Seleccione una opción: ");
        return sc.nextInt();
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static double leerDecimal(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }
    
    public static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        sc.nextLine(); // Limpiar buffer
        return sc.nextLine();
    }

    public static double logaritmo(double numero) {
        return (numero > 0) ? Math.log(numero) : Double.NaN;
    }

    public static double raiz(double numero) {
        return (numero >= 0) ? Math.sqrt(numero) : Double.NaN;
    }

    public static double potencia(double x, double y) {
        return Math.pow(x, y);
    }

    public static int numinvertido(int numero) {
        int invertido = 0;
        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        return invertido;
    }

    public static void mayormenor(int numero1, int numero2) {
        if (numero1 == numero2) {
            System.out.println("Ambos números son iguales.");
        } else {
            System.out.println("Mayor: " + Math.max(numero1, numero2) +
                    " | Menor: " + Math.min(numero1, numero2));
        }
    }

    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static double division(int numero1, int numero2) {
        if (numero2 == 0) {
            System.out.println("ERROR: No se puede dividir por cero");
            return Double.NaN;
        }
        return (double) numero1 / numero2;
    }

    public static void contadorRegresivo(int segundos) {
        System.out.print("\nVolviendo al menú en: ");
        for (int i = segundos; i >= 1; i--) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\n");
    }
    
    // 2. Validador de Números

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
    
    public static boolean esPerfecto(int numero) {
        if (numero <= 1) return false;
        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }
    
    public static boolean esPalindromoNumero(int numero) {
        return numero == numinvertido(numero);
    }
    
    // 3. Manipulación de Cadenas
    public static void contarVocalesConsonantes(String cadena) {
        cadena = cadena.toLowerCase();
        int vocales = 0;
        int consonantes = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }
        
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }
    
    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }
    
    public static boolean esPalindromoCadena(String cadena) {
        String sinEspacios = cadena.replaceAll("\\s+", "").toLowerCase();
        return sinEspacios.equals(invertirCadena(sinEspacios));
    }
    
    public static int contarPalabras(String frase) {
        if (frase.trim().isEmpty()) return 0;
        return frase.trim().split("\\s+").length;
    }
    
    // 4. Operaciones con Listas

    public static void mayorMenorLista(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía");
            return;
        }
        int mayor = Collections.max(lista);
        int menor = Collections.min(lista);
        System.out.println("Mayor elemento: " + mayor);
        System.out.println("Menor elemento: " + menor);
    }
    
    public static double calcularPromedio(ArrayList<Integer> lista) {
        if (lista.isEmpty()) return 0;
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return (double) suma / lista.size();
    }
    
    public static ArrayList<Integer> eliminarDuplicados(ArrayList<Integer> lista) {
        HashSet<Integer> set = new HashSet<>(lista);
        return new ArrayList<>(set);
    }
    
    public static void bubbleSort(ArrayList<Integer> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }
    
    public static ArrayList<Integer> ingresarLista() {
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.print("¿Cuántos números desea ingresar? ");
        int cantidad = sc.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            lista.add(sc.nextInt());
        }
        return lista;
    }
    
    // 5. Conversor de Unidades
    public static void conversorTemperatura() {
        System.out.println("\n--- Conversor de Temperatura ---");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Celsius a Kelvin");
        System.out.println("3. Fahrenheit a Celsius");
        System.out.println("4. Fahrenheit a Kelvin");
        System.out.println("5. Kelvin a Celsius");
        System.out.println("6. Kelvin a Fahrenheit");
        System.out.print("Seleccione conversión: ");
        int opcion = sc.nextInt();
        
        System.out.print("Ingrese el valor: ");
        double valor = sc.nextDouble();
        double resultado = 0;
        
        switch (opcion) {
            case 1: resultado = (valor * 9/5) + 32; break;
            case 2: resultado = valor + 273.15; break;
            case 3: resultado = (valor - 32) * 5/9; break;
            case 4: resultado = (valor - 32) * 5/9 + 273.15; break;
            case 5: resultado = valor - 273.15; break;
            case 6: resultado = (valor - 273.15) * 9/5 + 32; break;
            default: System.out.println("Opción inválida"); return;
        }
        System.out.printf("Resultado: %.2f\n", resultado);
    }
    
    public static void conversorLongitud() {
        System.out.println("\n--- Conversor de Longitud ---");
        System.out.println("1. Metros a Kilómetros");
        System.out.println("2. Kilómetros a Metros");
        System.out.println("3. Metros a Millas");
        System.out.println("4. Millas a Metros");
        System.out.println("5. Kilómetros a Millas");
        System.out.println("6. Millas a Kilómetros");
        System.out.print("Seleccione conversión: ");
        int opcion = sc.nextInt();
        
        System.out.print("Ingrese el valor: ");
        double valor = sc.nextDouble();
        double resultado = 0;
        
        switch (opcion) {
            case 1: resultado = valor / 1000; break;
            case 2: resultado = valor * 1000; break;
            case 3: resultado = valor * 0.000621371; break;
            case 4: resultado = valor / 0.000621371; break;
            case 5: resultado = valor * 0.621371; break;
            case 6: resultado = valor / 0.621371; break;
            default: System.out.println("Opción inválida"); return;
        }
        System.out.printf("Resultado: %.4f\n", resultado);
    }
    
    public static void conversorPeso() {
        System.out.println("\n--- Conversor de Peso ---");
        System.out.println("1. Kilogramos a Libras");
        System.out.println("2. Kilogramos a Onzas");
        System.out.println("3. Libras a Kilogramos");
        System.out.println("4. Libras a Onzas");
        System.out.println("5. Onzas a Kilogramos");
        System.out.println("6. Onzas a Libras");
        System.out.print("Seleccione conversión: ");
        int opcion = sc.nextInt();
        
        System.out.print("Ingrese el valor: ");
        double valor = sc.nextDouble();
        double resultado = 0;
        
        switch (opcion) {
            case 1: resultado = valor * 2.20462; break;
            case 2: resultado = valor * 35.274; break;
            case 3: resultado = valor / 2.20462; break;
            case 4: resultado = valor * 16; break;
            case 5: resultado = valor / 35.274; break;
            case 6: resultado = valor / 16; break;
            default: System.out.println("Opción inválida"); return;
        }
        System.out.printf("Resultado: %.4f\n", resultado);
    }
    
    public static void conversorTiempo() {
        System.out.println("\n--- Conversor de Tiempo ---");
        System.out.println("1. Segundos a Minutos");
        System.out.println("2. Segundos a Horas");
        System.out.println("3. Minutos a Segundos");
        System.out.println("4. Minutos a Horas");
        System.out.println("5. Horas a Segundos");
        System.out.println("6. Horas a Minutos");
        System.out.print("Seleccione conversión: ");
        int opcion = sc.nextInt();
        
        System.out.print("Ingrese el valor: ");
        double valor = sc.nextDouble();
        double resultado = 0;
        
        switch (opcion) {
            case 1: resultado = valor / 60; break;
            case 2: resultado = valor / 3600; break;
            case 3: resultado = valor * 60; break;
            case 4: resultado = valor / 60; break;
            case 5: resultado = valor * 3600; break;
            case 6: resultado = valor * 60; break;
            default: System.out.println("Opción inválida"); return;
        }
        System.out.printf("Resultado: %.4f\n", resultado);
    }
}