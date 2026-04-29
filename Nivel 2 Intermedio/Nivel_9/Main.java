import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrito miCarrito = new Carrito();
        
        int opcion;
        do {
            System.out.println("\n=== CARRITO DE COMPRAS ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Ver carrito");
            System.out.println("4. Calcular total");
            System.out.println("5. Aplicar descuento");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    
                    System.out.print("Precio: $");
                    double precio = scanner.nextDouble();
                    
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    
                    Producto nuevoProducto = new Producto(nombre, precio, cantidad);
                    miCarrito.agregarProducto(nuevoProducto);
                    break;
                    
                case 2:
                    if (miCarrito.productos.isEmpty()) {
                        System.out.println("El carrito está vacío");
                    } else {
                        miCarrito.mostrarCarrito();
                        System.out.print("Nombre del producto a eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        miCarrito.eliminarProducto(nombreEliminar);
                    }
                    break;
                    
                case 3:
                    miCarrito.mostrarCarrito();
                    break;
                    
                case 4:
                    double total = miCarrito.calcularTotal();
                    System.out.println("\nTotal del carrito: $" + total);
                    break;
                    
                case 5:
                    if (miCarrito.productos.isEmpty()) {
                        System.out.println("El carrito está vacío, no se puede aplicar descuento");
                    } else {
                        System.out.print("Porcentaje de descuento (0-100): ");
                        double descuento = scanner.nextDouble();
                        miCarrito.aplicarDescuento(descuento);
                    }
                    break;
                    
                case 6:
                    System.out.println("\n¡Gracias por tu compra!");
                    break;
                    
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion != 6);
        
        scanner.close();
    }
}