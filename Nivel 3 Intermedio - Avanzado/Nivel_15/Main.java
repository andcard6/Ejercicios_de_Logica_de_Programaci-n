import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" BIENVENIDO AL JUEGO DE DADOS ");
        System.out.println("======================================");
        System.out.println("Reglas:");
        System.out.println("- Cada jugador lanza el dado 3 veces por ronda");
        System.out.println("- Se suman los valores de los 3 lanzamientos");
        System.out.println("- Gana el que tenga mayor suma");
        System.out.println("======================================");
        
        Juego juego = new Juego();
        
        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Jugar partida (varias rondas)");
            System.out.println("2. Modo rápido (una ronda)");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            if (opcion == 1) {
                juego.jugarPartida();
            } else if (opcion == 2) {
                juego.jugarModoRapido();
            } else if (opcion == 3) {
                System.out.println("\n¡Gracias por jugar!");
                System.out.println(" ¡Hasta la próxima! ");
            } else {
                System.out.println("Opción no válida");
            }
            
        } while (opcion != 3);
        
        scanner.close();
    }
}