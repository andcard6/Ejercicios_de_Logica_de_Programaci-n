package Funciones_Nivel_3;

public class FuncionesCadenas {

    // Contar vocales
    public static int contarVocales(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        return contador;
    }

    // Contar consonantes
    public static int contarConsonantes(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (Character.isLetter(letra) &&
                letra != 'a' && letra != 'e' &&
                letra != 'i' && letra != 'o' &&
                letra != 'u') {
                contador++;
            }
        }

        return contador;
    }

    // Invertir cadena
    public static String invertirCadena(String texto) {
        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        return invertida;
    }

    // Verificar si es palíndromo
    public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase();
        texto = texto.replace(" ", "");

        String invertida = invertirCadena(texto);

        return texto.equals(invertida);
    }

    // Contar palabras
    public static int contarPalabras(String frase) {
        if (frase.trim().isEmpty()) {
            return 0;
        }

        String[] palabras = frase.trim().split(" ");

        return palabras.length;
    }
}
