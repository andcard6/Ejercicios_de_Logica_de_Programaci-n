package Nivel_2.Funciones_Nivel_2;

public class Funciones {

    // Par o Impar
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Números Primos
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Números Perfectos
    public static boolean esPerfecto(int numero) {
        int sumaDivisores = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == numero;
    }

    // Números Palíndromos
    public static boolean esPalindromo(int numero) {
        String numeroTexto = String.valueOf(numero);
        String invertido = new StringBuilder(numeroTexto).reverse().toString();

        return numeroTexto.equals(invertido);
    }
}
