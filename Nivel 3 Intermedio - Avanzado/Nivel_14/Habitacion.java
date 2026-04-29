public class Habitacion {

    int numero;
    String tipo;      // Simple, Doble, Suite
    double precio;
    boolean ocupada;

    Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.ocupada = false;  
    }
    

    void mostrarInfo() {
        System.out.println("Habitación #" + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Precio por noche: $" + precio);
        if (ocupada) {
            System.out.println("Estado: OCUPADA");
        } else {
            System.out.println("Estado: DISPONIBLE");
        }
        System.out.println("------------------------");
    }
}