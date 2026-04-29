import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        
        // Agregar algunos libros de ejemplo
        System.out.println("=== CARGANDO DATOS DE EJEMPLO ===");
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-84-376-0494-7");
        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", "978-84-376-0495-4");
        Libro libro3 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", "978-84-376-0496-1");
        Libro libro4 = new Libro("Rayuela", "Julio Cortázar", "978-84-376-0497-8");
        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        
        int opcion;
        do {
            System.out.println("\n=== BIBLIOTECA MUNICIPAL ===");
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Agregar nuevo libro");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Ver catálogo completo");
            System.out.println("6. Ver libros disponibles");
            System.out.println("7. Ver usuarios registrados");
            System.out.println("8. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            if (opcion == 1) {
                System.out.print("Nombre del usuario: ");
                String nombre = scanner.nextLine();
                Usuario nuevoUsuario = new Usuario(nombre);
                biblioteca.registrarUsuario(nuevoUsuario);
                
            } else if (opcion == 2) {
                System.out.print("Título: ");
                String titulo = scanner.nextLine();
                System.out.print("Autor: ");
                String autor = scanner.nextLine();
                System.out.print("ISBN: ");
                String isbn = scanner.nextLine();
                Libro nuevoLibro = new Libro(titulo, autor, isbn);
                biblioteca.agregarLibro(nuevoLibro);
                
            } else if (opcion == 3) {
                if (biblioteca.usuarios.isEmpty()) {
                    System.out.println("Primero registra un usuario");
                } else if (biblioteca.catalogo.isEmpty()) {
                    System.out.println("No hay libros en la biblioteca");
                } else {
                    biblioteca.mostrarLibrosDisponibles();
                    System.out.print("Nombre del usuario: ");
                    String nombreUser = scanner.nextLine();
                    System.out.print("Título del libro: ");
                    String tituloLibro = scanner.nextLine();
                    biblioteca.prestarLibro(nombreUser, tituloLibro);
                }
                
            } else if (opcion == 4) {
                if (biblioteca.usuarios.isEmpty()) {
                    System.out.println("No hay usuarios registrados");
                } else {
                    System.out.print("Nombre del usuario: ");
                    String nombreUser = scanner.nextLine();
                    System.out.print("Título del libro a devolver: ");
                    String tituloLibro = scanner.nextLine();
                    biblioteca.devolverLibro(nombreUser, tituloLibro);
                }
                
            } else if (opcion == 5) {
                biblioteca.mostrarCatalogo();
                
            } else if (opcion == 6) {
                biblioteca.mostrarLibrosDisponibles();
                
            } else if (opcion == 7) {
                biblioteca.mostrarUsuarios();
                
            } else if (opcion == 8) {
                System.out.println("¡Gracias por usar la biblioteca!");
                
            } else {
                System.out.println("Opción no válida");
            }
            
        } while (opcion != 8);
        
        scanner.close();
    }
}