public class Producto {
    // Atributos
    String nombre;
    double precio;
    int cantidad;
    
    // Constructor
    Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    // Método para mostrar información del producto
    void mostrarInfo() {
        System.out.println(nombre + " - $" + precio + " x " + cantidad + " = $" + (precio * cantidad));
    }
}