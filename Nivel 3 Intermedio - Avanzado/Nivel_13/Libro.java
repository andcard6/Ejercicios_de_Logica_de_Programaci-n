public class Libro {
    String titulo;
    String autor;
    String ISBN;
    boolean disponible;  // true = disponible, false = prestado
    

    Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = true;  // Los libros nuevos están disponibles
    }
    

    void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        if (disponible) {
            System.out.println("Estado: Disponible");
        } else {
            System.out.println("Estado: Prestado");
        }
        System.out.println("------------------------");
    }
}