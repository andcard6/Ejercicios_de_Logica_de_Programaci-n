import java.util.ArrayList;

public class Carrito {
    // Lista de productos
    ArrayList<Producto> productos;
    
    
    Carrito() {
        productos = new ArrayList<Producto>();
    }
    
    // Método para agregar producto
    void agregarProducto(Producto producto) {
        // Verificar si el producto ya existe en el carrito
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).nombre.equals(producto.nombre)) {
                // Si existe, sumar la cantidad
                productos.get(i).cantidad += producto.cantidad;
                System.out.println("Producto actualizado. Nueva cantidad: " + productos.get(i).cantidad);
                return;
            }
        }
        // Si no existe, agregarlo nuevo
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.nombre);
    }
    
    // Método para eliminar producto
    void eliminarProducto(String nombreProducto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).nombre.equals(nombreProducto)) {
                productos.remove(i);
                System.out.println("Producto eliminado: " + nombreProducto);
                return;
            }
        }
        System.out.println("Producto no encontrado: " + nombreProducto);
    }
    
    // Método para calcular total
    double calcularTotal() {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).precio * productos.get(i).cantidad;
        }
        return total;
    }
    
    // Método para aplicar descuento (porcentaje)
    void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double totalActual = calcularTotal();
            double descuento = totalActual * (porcentaje / 100);
            double totalConDescuento = totalActual - descuento;
            System.out.println("\n=== DESCUENTO APLICADO ===");
            System.out.println("Porcentaje: " + porcentaje + "%");
            System.out.println("Total sin descuento: $" + totalActual);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total con descuento: $" + totalConDescuento);
            System.out.println("==========================");
        } else {
            System.out.println("Porcentaje de descuento no válido (usa 0-100)");
        }
    }
    
    // Método para mostrar el carrito
    void mostrarCarrito() {
        if (productos.isEmpty()) {
            System.out.println("\nEl carrito está vacío");
        } else {
            System.out.println("\n=== PRODUCTOS EN EL CARRITO ===");
            for (int i = 0; i < productos.size(); i++) {
                System.out.print((i+1) + ". ");
                productos.get(i).mostrarInfo();
            }
            System.out.println("Total: $" + calcularTotal());
            System.out.println("================================");
        }
    }
}