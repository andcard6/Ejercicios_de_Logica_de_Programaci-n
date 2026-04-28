import java.util.Scanner;
import Funciones_Nivel_3.*;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("         ANALIZADOR  DE CADENAS          ");
        System.out.println("=========================================");

        // Solicitar texto al usuario
        System.out.print("Ingrese una palabra o frase: ");
        String texto = scanner.nextLine();

        // Resultados
        int vocales = FuncionesCadenas.contarVocales(texto);
        int consonantes = FuncionesCadenas.contarConsonantes(texto);
        String invertida = FuncionesCadenas.invertirCadena(texto);
        boolean palindromo = FuncionesCadenas.esPalindromo(texto);
        int palabras = FuncionesCadenas.contarPalabras(texto);

        // Mostrar resultados
        System.out.println("\n=========== RESULTADOS ===========");
        System.out.println("1. Vocales: " + vocales);
        System.out.println("2. Consonantes: " + consonantes);
        System.out.println("3. Cadena invertida: " + invertida);
        System.out.println("4. Número de palabras: " + palabras);

        if (palindromo) {
            System.out.println("• Es un palíndromo.");
        } else {
            System.out.println("• No es un palíndromo.");
        }

        System.out.println("==================================");

        scanner.close();
    }
}