package Funciones_Nivel_4;


public class FuncionesListas {

    // Encontrar número mayor
    public static int encontrarMayor(int[] numeros) {
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    // Encontrar número menor
    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        return menor;
    }

    // Calcular promedio
    public static double calcularPromedio(int[] numeros) {
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return (double) suma / numeros.length;
    }

    // Eliminar duplicados
    public static int[] eliminarDuplicados(int[] numeros) {
        int[] temporal = new int[numeros.length];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < contador; j++) {
                if (numeros[i] == temporal[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                temporal[contador] = numeros[i];
                contador++;
            }
        }

        int[] resultado = new int[contador];

        for (int i = 0; i < contador; i++) {
            resultado[i] = temporal[i];
        }

        return resultado;
    }

    // Ordenar lista con Bubble Sort
    public static void ordenarBubbleSort(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {

                    // Intercambio
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
                }
            }
        }
    }

    // Mostrar arreglo
    public static void mostrarArreglo(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}

