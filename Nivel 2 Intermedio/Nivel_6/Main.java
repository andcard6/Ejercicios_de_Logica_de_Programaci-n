import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n========== MENÚ ESTUDIANTES ==========");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Agregar nota");
            System.out.println("3. Mostrar estudiantes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                // ================= AGREGAR ESTUDIANTE =================
                case 1:

                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese edad: ");
                    int edad = scanner.nextInt();

                    estudiantes.add(new Estudiante(nombre, edad));

                    System.out.println("Estudiante agregado correctamente.");
                    break;

                // ================= AGREGAR NOTA =================
                case 2:

                    if (estudiantes.size() == 0) {
                        System.out.println("No hay estudiantes registrados.");
                        break;
                    }

                    System.out.println("\nLista de estudiantes:");

                    for (int i = 0; i < estudiantes.size(); i++) {
                        System.out.println((i + 1) + ". " + estudiantes.get(i).nombre);
                    }

                    System.out.print("Seleccione estudiante: ");
                    int indice = scanner.nextInt() - 1;

                    if (indice >= 0 && indice < estudiantes.size()) {

                        System.out.print("Ingrese nota: ");
                        double nota = scanner.nextDouble();

                        estudiantes.get(indice).agregarCalificacion(nota);

                        System.out.println("Nota agregada correctamente.");

                    } else {
                        System.out.println("Estudiante no válido.");
                    }

                    break;

                // ================= MOSTRAR =================
                case 3:

                    if (estudiantes.size() == 0) {
                        System.out.println("No hay estudiantes registrados.");
                    } else {

                        for (Estudiante estudiante : estudiantes) {
                            estudiante.mostrarInformacion();
                        }
                    }

                    break;

                // ================= SALIR =================
                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}