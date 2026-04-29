import java.util.ArrayList;

public class Estudiante {

    public String nombre;
    public int edad;
    public ArrayList<Double> calificaciones;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new ArrayList<>();
    }

    // Método para agregar nota
    public void agregarCalificacion(double nota) {
        calificaciones.add(nota);
    }

    // Método para calcular promedio
    public double calcularPromedio() {

        if (calificaciones.size() == 0) {
            return 0;
        }

        double suma = 0;

        for (double nota : calificaciones) {
            suma += nota;
        }

        return suma / calificaciones.size();
    }

    // Método aprobar o reprobar
    public boolean aprobo() {
        return calcularPromedio() >= 3.0;
    }

    // Mostrar información
    public void mostrarInformacion() {

        System.out.println("\n===== INFORMACIÓN DEL ESTUDIANTE =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificaciones: " + calificaciones);
        System.out.println("Promedio: " + calcularPromedio());

        if (aprobo()) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}