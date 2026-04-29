import java.util.Random;

public class Dado {
 
    int valorActual;
    Random random;
    
    // Constructor
    Dado() {
        random = new Random();
        valorActual = 1;  // Valor inicial
    }
    
    // Lanzar el dado (genera número entre 1 y 6)
    int lanzar() {
        valorActual = random.nextInt(6) + 1;  
        return valorActual;
    }
    
    // Obtener el valor actual sin lanzar
    int obtenerValor() {
        return valorActual;
    }
    
    // Mostrar el dado (forma gráfica simple)
    void mostrarDado() {
        System.out.println("┌───────┐");
        if (valorActual == 1) {
            System.out.println("│       │");
            System.out.println("│   ●   │");
            System.out.println("│       │");
        } else if (valorActual == 2) {
            System.out.println("│ ●     │");
            System.out.println("│       │");
            System.out.println("│     ● │");
        } else if (valorActual == 3) {
            System.out.println("│ ●     │");
            System.out.println("│   ●   │");
            System.out.println("│     ● │");
        } else if (valorActual == 4) {
            System.out.println("│ ●   ● │");
            System.out.println("│       │");
            System.out.println("│ ●   ● │");
        } else if (valorActual == 5) {
            System.out.println("│ ●   ● │");
            System.out.println("│   ●   │");
            System.out.println("│ ●   ● │");
        } else if (valorActual == 6) {
            System.out.println("│ ●   ● │");
            System.out.println("│ ●   ● │");
            System.out.println("│ ●   ● │");
        }
        System.out.println("└───────┘");
    }
}