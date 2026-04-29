import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Agenda miAgenda = new Agenda();
        int opcion;
        
        do {
            System.out.println("\n=== SISTEMA DE CONTACTOS ===");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto por nombre");
            System.out.println("4. Listar todos los contactos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                
                case 1:
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    
                    System.out.print("Ingrese telefono: ");
                    String telefono = scanner.nextLine();
                    
                    System.out.print("Ingrese correo: ");
                    String correo = scanner.nextLine();
                    
                    Contacto nuevoContacto = new Contacto(nombre, telefono, correo);
                    miAgenda.agregarContacto(nuevoContacto);
                    break;
                
                case 2:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    miAgenda.eliminarContacto(nombreEliminar);
                    break;
                
                case 3:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    miAgenda.buscarTodosPorNombre(nombreBuscar);
                    break;
                
                case 4:
                    miAgenda.listarTodos();
                    break;
                
                case 0:
                    System.out.println("Hasta luego. Saliendo del sistema...");
                    break;
                
                default:
                    System.out.println("Opcion invalida. Seleccione 0-4.");
            }
            
        } while (opcion != 0);
        
        scanner.close();
    }
}