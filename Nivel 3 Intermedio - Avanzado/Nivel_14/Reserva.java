public class Reserva {

    String cliente;
    Habitacion habitacion;
    int noches;
    

    Reserva(String cliente, Habitacion habitacion, int noches) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.noches = noches;
    }
    

    double calcularTotal() {
        return habitacion.precio * noches;
    }
    

    void mostrarReserva() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Habitación #" + habitacion.numero);
        System.out.println("Tipo: " + habitacion.tipo);
        System.out.println("Noches: " + noches);
        System.out.println("Precio por noche: $" + habitacion.precio);
        System.out.println("Total a pagar: $" + calcularTotal());
        System.out.println("------------------------");
    }
}