import java.util.ArrayList;

public class Hotel {

    String nombre;
    ArrayList<Habitacion> habitaciones;
    ArrayList<Reserva> reservas;
    

    Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<Habitacion>();
        this.reservas = new ArrayList<Reserva>();
    }
    
    // Agregar habitación al hotel
    void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
        System.out.println("Habitación #" + habitacion.numero + " agregada al hotel");
    }
    
    // Buscar habitación por número
    int buscarHabitacion(int numero) {
        for (int i = 0; i < habitaciones.size(); i++) {
            if (habitaciones.get(i).numero == numero) {
                return i;
            }
        }
        return -1;
    }
    
    // Mostrar todas las habitaciones
    void mostrarHabitaciones() {
        System.out.println("\n=== HABITACIONES DEL HOTEL " + nombre.toUpperCase() + " ===");
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones registradas");
        } else {
            for (int i = 0; i < habitaciones.size(); i++) {
                habitaciones.get(i).mostrarInfo();
            }
        }
    }
    
    // Mostrar habitaciones disponibles (no ocupadas)
    void mostrarDisponibles() {
        System.out.println("\n=== HABITACIONES DISPONIBLES ===");
        int contador = 0;
        for (int i = 0; i < habitaciones.size(); i++) {
            if (!habitaciones.get(i).ocupada) {
                habitaciones.get(i).mostrarInfo();
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay habitaciones disponibles en este momento");
        } else {
            System.out.println("Total disponibles: " + contador);
        }
    }
    
    // Mostrar habitaciones ocupadas
    void mostrarOcupadas() {
        System.out.println("\n=== HABITACIONES OCUPADAS ===");
        int contador = 0;
        for (int i = 0; i < habitaciones.size(); i++) {
            if (habitaciones.get(i).ocupada) {
                System.out.println("Habitación #" + habitaciones.get(i).numero + " - " + habitaciones.get(i).tipo);
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay habitaciones ocupadas");
        } else {
            System.out.println("Total ocupadas: " + contador);
        }
    }
    
    // Hacer una reserva
    void hacerReserva(String cliente, int numeroHabitacion, int noches) {
        System.out.println("\n=== NUEVA RESERVA ===");
        
        // Validar noches
        if (noches <= 0) {
            System.out.println("Error: Las noches deben ser mayor a 0");
            return;
        }
        
        // Buscar habitación
        int posicion = buscarHabitacion(numeroHabitacion);
        if (posicion == -1) {
            System.out.println("Error: La habitación #" + numeroHabitacion + " no existe");
            return;
        }
        
        Habitacion habitacion = habitaciones.get(posicion);
        
        // Verificar si está ocupada
        if (habitacion.ocupada) {
            System.out.println("Error: La habitación #" + numeroHabitacion + " ya está ocupada");
            return;
        }
        
        // Crear la reserva
        Reserva nuevaReserva = new Reserva(cliente, habitacion, noches);
        reservas.add(nuevaReserva);
        
        // Marcar habitación como ocupada
        habitacion.ocupada = true;
        
        System.out.println("¡Reserva confirmada!");
        System.out.println("Cliente: " + cliente);
        System.out.println("Habitación #" + habitacion.numero);
        System.out.println("Noches: " + noches);
        System.out.println("Total: $" + nuevaReserva.calcularTotal());
    }
    
    // Cancelar reserva
    void cancelarReserva(String cliente, int numeroHabitacion) {
        System.out.println("\n=== CANCELAR RESERVA ===");
        
        // Buscar la reserva
        int posReserva = -1;
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).cliente.equalsIgnoreCase(cliente) && 
                reservas.get(i).habitacion.numero == numeroHabitacion) {
                posReserva = i;
                break;
            }
        }
        
        if (posReserva == -1) {
            System.out.println("Error: No se encontró la reserva");
            return;
        }
        
        // Buscar la habitación para liberarla
        int posHabitacion = buscarHabitacion(numeroHabitacion);
        if (posHabitacion != -1) {
            habitaciones.get(posHabitacion).ocupada = false;
        }
        
        // Eliminar la reserva
        Reserva reservaCancelada = reservas.get(posReserva);
        reservas.remove(posReserva);
        
        System.out.println("Reserva cancelada para: " + cliente);
        System.out.println("Habitación #" + numeroHabitacion + " ahora está disponible");
        System.out.println("Total reembolsado: $" + reservaCancelada.calcularTotal());
    }
    
    // Mostrar todas las reservas
    void mostrarReservas() {
        System.out.println("\n=== RESERVAS ACTIVAS ===");
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas activas");
        } else {
            for (int i = 0; i < reservas.size(); i++) {
                System.out.println("\n--- Reserva #" + (i+1) + " ---");
                reservas.get(i).mostrarReserva();
            }
        }
    }
    
    // Buscar reservas por cliente
    void buscarReservasPorCliente(String cliente) {
        System.out.println("\n=== RESERVAS DE " + cliente.toUpperCase() + " ===");
        int contador = 0;
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).cliente.equalsIgnoreCase(cliente)) {
                reservas.get(i).mostrarReserva();
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay reservas para el cliente: " + cliente);
        } else {
            System.out.println("Total de reservas: " + contador);
        }
    }
    
    // Calcular ocupación del hotel
    void calcularOcupacion() {
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones registradas");
            return;
        }
        
        int total = habitaciones.size();
        int ocupadas = 0;
        for (int i = 0; i < habitaciones.size(); i++) {
            if (habitaciones.get(i).ocupada) {
                ocupadas++;
            }
        }
        
        double porcentaje = (ocupadas * 100.0) / total;
        System.out.println("\n=== OCUPACIÓN DEL HOTEL ===");
        System.out.println("Total habitaciones: " + total);
        System.out.println("Ocupadas: " + ocupadas);
        System.out.println("Disponibles: " + (total - ocupadas));
        System.out.println("Porcentaje ocupación: " + porcentaje + "%");
    }
}