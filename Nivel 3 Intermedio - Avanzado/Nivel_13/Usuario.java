import java.util.ArrayList;

public class Usuario {

    String nombre;
    ArrayList<Libro> librosPrestados;
    

    Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<Libro>();
    }
    
    // Ver si puede pedir otro libro (máximo 3)
    boolean puedePedirLibro() {
        return librosPrestados.size() < 3;
    }
    
    // Contar cuántos libros tiene prestados
    int contarLibrosPrestados() {
        return librosPrestados.size();
    }
    
    // Mostrar información del usuario
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Libros prestados: " + librosPrestados.size() + "/3");
        
        if (librosPrestados.size() > 0) {
            System.out.println("Libros actuales:");
            for (int i = 0; i < librosPrestados.size(); i++) {
                System.out.println("  " + (i+1) + ". " + librosPrestados.get(i).titulo);
            }
        }
        System.out.println("------------------------");
    }
}