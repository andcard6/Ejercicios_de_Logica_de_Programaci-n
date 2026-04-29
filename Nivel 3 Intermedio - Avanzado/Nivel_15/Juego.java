import java.util.Scanner;

public class Juego {
 
    Jugador jugador1;
    Jugador jugador2;
    Dado dado;
    Scanner scanner;
    

    Juego() {
        scanner = new Scanner(System.in);
        dado = new Dado();
    }
    
    // Registrar jugadores
    void registrarJugadores() {
        System.out.println("\n=== REGISTRO DE JUGADORES ===");
        System.out.print("Nombre del Jugador 1: ");
        String nombre1 = scanner.nextLine();
        jugador1 = new Jugador(nombre1);
        
        System.out.print("Nombre del Jugador 2: ");
        String nombre2 = scanner.nextLine();
        jugador2 = new Jugador(nombre2);
        
        System.out.println("\n¡Jugadores registrados!");
        System.out.println("Jugador 1: " + jugador1.nombre);
        System.out.println("Jugador 2: " + jugador2.nombre);
    }
    
    // Un jugador lanza el dado 3 veces y retorna la suma
    int turnoJugador(Jugador jugador) {
        System.out.println("\n═══════════════════════════════");
        System.out.println(" TURNO DE " + jugador.nombre.toUpperCase() + " ");
        System.out.println("═══════════════════════════════");
        
        int suma = 0;
        
        // Lanzar el dado 3 veces
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nLanzamiento #" + i);
            System.out.print("Presiona ENTER para lanzar el dado...");
            scanner.nextLine();
            
            int valor = dado.lanzar();
            suma = suma + valor;
            
            System.out.println("¡Resultado: " + valor + "!");
            dado.mostrarDado();
        }
        
        System.out.println("\n SUMA TOTAL DE " + jugador.nombre + ": " + suma);
        return suma;
    }
    
    // Jugar una ronda completa
    void jugarRonda() {
        System.out.println("\n NUEVA RONDA ");
        
        // Turno del jugador 1
        int suma1 = turnoJugador(jugador1);
        jugador1.sumarPuntos(suma1);
        
        // Turno del jugador 2
        int suma2 = turnoJugador(jugador2);
        jugador2.sumarPuntos(suma2);
        
        // Mostrar resultados de la ronda
        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(" RESULTADOS DE LA RONDA ");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(jugador1.nombre + " sumó: " + suma1 + " puntos");
        System.out.println(jugador2.nombre + " sumó: " + suma2 + " puntos");
        
        if (suma1 > suma2) {
            System.out.println("\n ¡" + jugador1.nombre + " GANA LA RONDA! ");
        } else if (suma2 > suma1) {
            System.out.println("\n¡" + jugador2.nombre + " GANA LA RONDA! ");
        } else {
            System.out.println("\n ¡EMPATE EN LA RONDA! ");
        }
        
        // Mostrar puntos acumulados
        System.out.println("\n PUNTOS ACUMULADOS:");
        jugador1.mostrarEstado();
        jugador2.mostrarEstado();
    }
    
    // Jugar varias rondas y determinar ganador final
    void jugarPartida() {
        registrarJugadores();
        
        System.out.print("\n¿Cuántas rondas quieres jugar? ");
        int rondas = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        

        jugador1.reiniciarPuntos();
        jugador2.reiniciarPuntos();
        
        System.out.println("\n ¡COMENZAMOS EL JUEGO! ");
        System.out.println("Se jugarán " + rondas + " rondas");
        System.out.println("Gana el que tenga más puntos al final\n");
        
        // Jugar las rondas
        for (int i = 1; i <= rondas; i++) {
            System.out.println("\n═══════════════════════════════════");
            System.out.println("        RONDA " + i + " DE " + rondas);
            System.out.println("═══════════════════════════════════");
            jugarRonda();
        }
        
        // Determinar ganador final
        determinarGanadorFinal();
    }
    
    // Determinar quién ganó la partida completa
    void determinarGanadorFinal() {
        System.out.println("\n RESULTADO FINAL ");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("PUNTOS TOTALES:");
        System.out.println(jugador1.nombre + ": " + jugador1.puntos + " puntos");
        System.out.println(jugador2.nombre + ": " + jugador2.puntos + " puntos");
        
        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        if (jugador1.puntos > jugador2.puntos) {
            System.out.println("¡" + jugador1.nombre.toUpperCase() + " ES EL GANADOR! ");
        } else if (jugador2.puntos > jugador1.puntos) {
            System.out.println(" ¡" + jugador2.nombre.toUpperCase() + " ES EL GANADOR! ");
        } else {
            System.out.println(" ¡EMPATE! Los dos jugadores tienen los mismos puntos ");
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
    
    // Modo rápido (jugar una sola ronda)
    void jugarModoRapido() {
        registrarJugadores();
        
        System.out.println("\n MODO RÁPIDO - Una sola ronda ");
        
        // Turno del jugador 1
        int suma1 = turnoJugador(jugador1);
        
        // Turno del jugador 2
        int suma2 = turnoJugador(jugador2);
        
        // Mostrar resultados
        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(" RESULTADO FINAL ");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(jugador1.nombre + ": " + suma1 + " puntos");
        System.out.println(jugador2.nombre + ": " + suma2 + " puntos");
        
        if (suma1 > suma2) {
            System.out.println("\n¡" + jugador1.nombre + " GANA!");
        } else if (suma2 > suma1) {
            System.out.println("\n¡" + jugador2.nombre + " GANA!");
        } else {
            System.out.println("\n¡EMPATE!");
        }
    }
}