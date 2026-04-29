import java.util.Scanner;
import Funciones_Nivel_4.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("      ANALIZADOR DE LISTAS               ");
        System.out.println("=========================================");

        // Pedir cantidad de números
        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        // Ingresar números
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar arreglo original
        System.out.println("\nArreglo original:");
        FuncionesListas.mostrarArreglo(numeros);

        // Mayor y menor
        int mayor = FuncionesListas.encontrarMayor(numeros);
        int menor = FuncionesListas.encontrarMenor(numeros);

        // Promedio
        double promedio = FuncionesListas.calcularPromedio(numeros);

        // Eliminar duplicados
        int[] sinDuplicados = FuncionesListas.eliminarDuplicados(numeros);

        // Ordenar arreglo original
        FuncionesListas.ordenarBubbleSort(numeros);

        // Resultados
        System.out.println("\n=========== RESULTADOS ===========");
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Promedio: " + promedio);

        System.out.println("\nArreglo sin duplicados:");
        FuncionesListas.mostrarArreglo(sinDuplicados);

        System.out.println("\nArreglo ordenado (Bubble Sort):");
        FuncionesListas.mostrarArreglo(numeros);

        System.out.println("=================================");

        scanner.close();
    }
}
