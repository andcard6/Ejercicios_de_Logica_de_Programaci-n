import java.util.ArrayList;

public class Biblioteca {
    // Atributos
    ArrayList<Libro> catalogo;
    ArrayList<Usuario> usuarios;
    
    // Constructor
    Biblioteca() {
        catalogo = new ArrayList<Libro>();
        usuarios = new ArrayList<Usuario>();
    }
    
    // Agregar libro al catálogo
    void agregarLibro(Libro libro) {
        catalogo.add(libro);
        System.out.println("Libro agregado: " + libro.titulo);
    }
    
    // Registrar usuario
    void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.nombre);
    }
    
    // Buscar libro por título (devuelve la posición o -1)
    int buscarLibro(String titulo) {
        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).titulo.equalsIgnoreCase(titulo)) {
                return i;
            }
        }
        return -1;
    }
    
    // Buscar usuario por nombre
    int buscarUsuario(String nombre) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).nombre.equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }
    
    // Prestar libro
    void prestarLibro(String nombreUsuario, String tituloLibro) {
        System.out.println("\n--- PRÉSTAMO ---");
        
        // Buscar usuario
        int posUsuario = buscarUsuario(nombreUsuario);
        if (posUsuario == -1) {
            System.out.println("Error: Usuario no encontrado");
            return;
        }
        
        // Buscar libro
        int posLibro = buscarLibro(tituloLibro);
        if (posLibro == -1) {
            System.out.println("Error: Libro no encontrado");
            return;
        }
        
        Usuario usuario = usuarios.get(posUsuario);
        Libro libro = catalogo.get(posLibro);
        
        // Verificar si el libro está disponible
        if (!libro.disponible) {
            System.out.println("Error: El libro ya está prestado");
            return;
        }
        
        // Verificar límite de libros
        if (!usuario.puedePedirLibro()) {
            System.out.println("Error: " + usuario.nombre + " ya tiene 3 libros prestados");
            System.out.println("Debe devolver un libro antes de pedir otro");
            return;
        }
        
        // Hacer el préstamo
        libro.disponible = false;
        usuario.librosPrestados.add(libro);
        System.out.println("¡Préstamo exitoso!");
        System.out.println(usuario.nombre + " pidió: " + libro.titulo);
        System.out.println("Ahora tiene " + usuario.contarLibrosPrestados() + "/3 libros");
    }
    
    // Devolver libro
    void devolverLibro(String nombreUsuario, String tituloLibro) {
        System.out.println("\n--- DEVOLUCIÓN ---");
        
        // Buscar usuario
        int posUsuario = buscarUsuario(nombreUsuario);
        if (posUsuario == -1) {
            System.out.println("Error: Usuario no encontrado");
            return;
        }
        
        // Buscar libro
        int posLibro = buscarLibro(tituloLibro);
        if (posLibro == -1) {
            System.out.println("Error: Libro no encontrado en el catálogo");
            return;
        }
        
        Usuario usuario = usuarios.get(posUsuario);
        Libro libro = catalogo.get(posLibro);
        
        // Verificar si el usuario tiene ese libro prestado
        boolean loTiene = false;
        for (int i = 0; i < usuario.librosPrestados.size(); i++) {
            if (usuario.librosPrestados.get(i).titulo.equalsIgnoreCase(tituloLibro)) {
                usuario.librosPrestados.remove(i);
                loTiene = true;
                break;
            }
        }
        
        if (!loTiene) {
            System.out.println("Error: " + usuario.nombre + " no tiene ese libro prestado");
            return;
        }
        
        // Devolver el libro
        libro.disponible = true;
        System.out.println("¡Devolución exitosa!");
        System.out.println(usuario.nombre + " devolvió: " + libro.titulo);
        System.out.println("Ahora tiene " + usuario.contarLibrosPrestados() + "/3 libros");
    }
    
    // Mostrar todos los libros
    void mostrarCatalogo() {
        System.out.println("\n=== CATÁLOGO DE LIBROS ===");
        if (catalogo.isEmpty()) {
            System.out.println("No hay libros en el catálogo");
        } else {
            for (int i = 0; i < catalogo.size(); i++) {
                catalogo.get(i).mostrarInfo();
            }
        }
    }
    
    // Mostrar todos los usuarios
    void mostrarUsuarios() {
        System.out.println("\n=== USUARIOS REGISTRADOS ===");
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                usuarios.get(i).mostrarInfo();
            }
        }
    }
    
    // Mostrar libros disponibles
    void mostrarLibrosDisponibles() {
        System.out.println("\n=== LIBROS DISPONIBLES ===");
        int contador = 0;
        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).disponible) {
                System.out.println("- " + catalogo.get(i).titulo + " (Autor: " + catalogo.get(i).autor + ")");
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay libros disponibles");
        } else {
            System.out.println("Total disponibles: " + contador);
        }
    }
}