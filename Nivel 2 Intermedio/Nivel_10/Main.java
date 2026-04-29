import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        int opcion;
        do {
            // Menú de opciones
            System.out.println("\n=== REGISTRO DE EMPLEADOS ===");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Ver todos los empleados");
            System.out.println("3. Buscar empleado por ID");
            System.out.println("4. Calcular salario anual de un empleado");
            System.out.println("5. Aplicar aumento a un empleado");
            System.out.println("6. Eliminar empleado");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion) {
                case 1:
                    // Agregar empleado
                    System.out.println("\n--- NUEVO EMPLEADO ---");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    
                    // Verificar si el ID ya existe
                    boolean idExiste = false;
                    for (int i = 0; i < listaEmpleados.size(); i++) {
                        if (listaEmpleados.get(i).ID.equals(id)) {
                            idExiste = true;
                            break;
                        }
                    }
                    
                    if (idExiste) {
                        System.out.println("Error: Ya existe un empleado con ese ID");
                        break;
                    }
                    
                    System.out.print("Salario mensual: $");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();
                    
                    System.out.print("Departamento: ");
                    String departamento = scanner.nextLine();
                    
                    Empleado nuevoEmpleado = new Empleado(nombre, id, salario, departamento);
                    listaEmpleados.add(nuevoEmpleado);
                    System.out.println("¡Empleado agregado con éxito!");
                    break;
                    
                case 2:
                    // Ver todos los empleados
                    if (listaEmpleados.isEmpty()) {
                        System.out.println("\nNo hay empleados registrados");
                    } else {
                        System.out.println("\n=== LISTA DE EMPLEADOS ===");
                        for (int i = 0; i < listaEmpleados.size(); i++) {
                            System.out.println("\nEmpleado #" + (i+1));
                            listaEmpleados.get(i).mostrarInfo();
                        }
                    }
                    break;
                    
                case 3:
                    // Buscar empleado por ID
                    if (listaEmpleados.isEmpty()) {
                        System.out.println("\nNo hay empleados registrados");
                    } else {
                        System.out.print("\nIngrese ID del empleado a buscar: ");
                        String idBuscar = scanner.nextLine();
                        
                        boolean encontrado = false;
                        for (int i = 0; i < listaEmpleados.size(); i++) {
                            if (listaEmpleados.get(i).ID.equals(idBuscar)) {
                                System.out.println("\n--- EMPLEADO ENCONTRADO ---");
                                listaEmpleados.get(i).mostrarInfo();
                                encontrado = true;
                                break;
                            }
                        }
                        
                        if (!encontrado) {
                            System.out.println("No se encontró un empleado con ID: " + idBuscar);
                        }
                    }
                    break;
                    
                case 4:
                    // Calcular salario anual
                    if (listaEmpleados.isEmpty()) {
                        System.out.println("\nNo hay empleados registrados");
                    } else {
                        System.out.print("\nIngrese ID del empleado: ");
                        String idAnual = scanner.nextLine();
                        
                        boolean encontrado = false;
                        for (int i = 0; i < listaEmpleados.size(); i++) {
                            if (listaEmpleados.get(i).ID.equals(idAnual)) {
                                double salarioAnual = listaEmpleados.get(i).calcularSalarioAnual();
                                System.out.println("\nEmpleado: " + listaEmpleados.get(i).nombre);
                                System.out.println("Salario anual: $" + salarioAnual);
                                encontrado = true;
                                break;
                            }
                        }
                        
                        if (!encontrado) {
                            System.out.println("No se encontró un empleado con ID: " + idAnual);
                        }
                    }
                    break;
                    
                case 5:
                    // Aplicar aumento
                    if (listaEmpleados.isEmpty()) {
                        System.out.println("\nNo hay empleados registrados");
                    } else {
                        System.out.print("\nIngrese ID del empleado: ");
                        String idAumento = scanner.nextLine();
                        
                        boolean encontrado = false;
                        for (int i = 0; i < listaEmpleados.size(); i++) {
                            if (listaEmpleados.get(i).ID.equals(idAumento)) {
                                System.out.print("Porcentaje de aumento (%): ");
                                double porcentaje = scanner.nextDouble();
                                scanner.nextLine();
                                System.out.println();
                                listaEmpleados.get(i).aplicarAumento(porcentaje);
                                encontrado = true;
                                break;
                            }
                        }
                        
                        if (!encontrado) {
                            System.out.println("No se encontró un empleado con ID: " + idAumento);
                        }
                    }
                    break;
                    
                case 6:
                    // Eliminar empleado
                    if (listaEmpleados.isEmpty()) {
                        System.out.println("\nNo hay empleados registrados");
                    } else {
                        System.out.print("\nIngrese ID del empleado a eliminar: ");
                        String idEliminar = scanner.nextLine();
                        
                        boolean encontrado = false;
                        for (int i = 0; i < listaEmpleados.size(); i++) {
                            if (listaEmpleados.get(i).ID.equals(idEliminar)) {
                                System.out.println("Empleado eliminado: " + listaEmpleados.get(i).nombre);
                                listaEmpleados.remove(i);
                                encontrado = true;
                                break;
                            }
                        }
                        
                        if (!encontrado) {
                            System.out.println("No se encontró un empleado con ID: " + idEliminar);
                        }
                    }
                    break;
                    
                case 7:
                    System.out.println("\n¡Sistema de empleados cerrado!");
                    break;
                    
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion != 7);
        
        scanner.close();
    }
}