import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del hotel: ");
        String nombreHotel = scanner.nextLine();
        Hotel hotel = new Hotel(nombreHotel);
        
        // Agregar habitaciones de ejemplo
        System.out.println("\n=== AGREGANDO HABITACIONES DE EJEMPLO ===");
        Habitacion h1 = new Habitacion(101, "Simple", 50.0);
        Habitacion h2 = new Habitacion(102, "Simple", 50.0);
        Habitacion h3 = new Habitacion(201, "Doble", 80.0);
        Habitacion h4 = new Habitacion(202, "Doble", 80.0);
        Habitacion h5 = new Habitacion(301, "Suite", 150.0);
        Habitacion h6 = new Habitacion(302, "Suite", 150.0);
        
        hotel.agregarHabitacion(h1);
        hotel.agregarHabitacion(h2);
        hotel.agregarHabitacion(h3);
        hotel.agregarHabitacion(h4);
        hotel.agregarHabitacion(h5);
        hotel.agregarHabitacion(h6);
        
        int opcion;
        do {
            System.out.println("\n=== SISTEMA DE RESERVAS - " + hotel.nombre.toUpperCase() + " ===");
            System.out.println("1. Ver todas las habitaciones");
            System.out.println("2. Ver habitaciones disponibles");
            System.out.println("3. Ver habitaciones ocupadas");
            System.out.println("4. Hacer reserva");
            System.out.println("5. Cancelar reserva");
            System.out.println("6. Ver todas las reservas");
            System.out.println("7. Buscar reservas por cliente");
            System.out.println("8. Ver ocupación del hotel");
            System.out.println("9. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            if (opcion == 1) {
                hotel.mostrarHabitaciones();
                
            } else if (opcion == 2) {
                hotel.mostrarDisponibles();
                
            } else if (opcion == 3) {
                hotel.mostrarOcupadas();
                
            } else if (opcion == 4) {
                if (hotel.habitaciones.isEmpty()) {
                    System.out.println("No hay habitaciones en el hotel");
                } else {
                    hotel.mostrarDisponibles();
                    System.out.print("Nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.print("Número de habitación: ");
                    int numero = scanner.nextInt();
                    System.out.print("Número de noches: ");
                    int noches = scanner.nextInt();
                    scanner.nextLine();
                    hotel.hacerReserva(cliente, numero, noches);
                }
                
            } else if (opcion == 5) {
                if (hotel.reservas.isEmpty()) {
                    System.out.println("No hay reservas activas para cancelar");
                } else {
                    System.out.print("Nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.print("Número de habitación: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    hotel.cancelarReserva(cliente, numero);
                }
                
            } else if (opcion == 6) {
                hotel.mostrarReservas();
                
            } else if (opcion == 7) {
                System.out.print("Nombre del cliente: ");
                String cliente = scanner.nextLine();
                hotel.buscarReservasPorCliente(cliente);
                
            } else if (opcion == 8) {
                hotel.calcularOcupacion();
                
            } else if (opcion == 9) {
                System.out.println("¡Gracias por usar el sistema de reservas!");
                System.out.println("Hotel " + hotel.nombre + " - ¡Hasta luego!");
                
            } else {
                System.out.println("Opción no válida");
            }
            
        } while (opcion != 9);
        
        scanner.close();
    }
}