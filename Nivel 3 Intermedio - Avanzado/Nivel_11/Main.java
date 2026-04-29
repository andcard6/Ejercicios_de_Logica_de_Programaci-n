import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehiculo> flotaVehiculos = new ArrayList<Vehiculo>();
        
        int opcion;
        do {
           
            System.out.println("\n=== SISTEMA DE VEHÍCULOS ===");
            System.out.println("1. Agregar Auto");
            System.out.println("2. Agregar Moto");
            System.out.println("3. Agregar Camión");
            System.out.println("4. Mostrar todos los vehículos");
            System.out.println("5. Calcular costo mantenimiento de un vehículo");
            System.out.println("6. Mostrar mantenimiento de toda la flota");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch(opcion) {
                case 1:
                    // Agregar Auto
                    System.out.println("\n--- AGREGAR AUTO ---");
                    System.out.print("Marca: ");
                    String marcaAuto = scanner.nextLine();
                    
                    System.out.print("Modelo: ");
                    String modeloAuto = scanner.nextLine();
                    
                    System.out.print("Año: ");
                    int añoAuto = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Número de puertas: ");
                    int puertas = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Tipo de combustible (Gasolina/Diesel/Eléctrico/Híbrido): ");
                    String combustible = scanner.nextLine();
                    
                    System.out.print("¿Tiene aire acondicionado? (true/false): ");
                    boolean aire = scanner.nextBoolean();
                    scanner.nextLine();
                    
                    Auto nuevoAuto = new Auto(marcaAuto, modeloAuto, añoAuto, puertas, combustible, aire);
                    flotaVehiculos.add(nuevoAuto);
                    System.out.println("¡Auto agregado con éxito!");
                    break;
                    
                case 2:
                    // Agregar Moto
                    System.out.println("\n--- AGREGAR MOTO ---");
                    System.out.print("Marca: ");
                    String marcaMoto = scanner.nextLine();
                    
                    System.out.print("Modelo: ");
                    String modeloMoto = scanner.nextLine();
                    
                    System.out.print("Año: ");
                    int añoMoto = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Cilindrada (cc): ");
                    int cilindrada = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Tipo de moto (Deportiva/Cruiser/Enduro/Scooter): ");
                    String tipoMoto = scanner.nextLine();
                    
                    System.out.print("¿Tiene baúl? (true/false): ");
                    boolean baul = scanner.nextBoolean();
                    scanner.nextLine();
                    
                    Moto nuevaMoto = new Moto(marcaMoto, modeloMoto, añoMoto, cilindrada, tipoMoto, baul);
                    flotaVehiculos.add(nuevaMoto);
                    System.out.println("¡Moto agregada con éxito!");
                    break;
                    
                case 3:
                    // Agregar Camión
                    System.out.println("\n--- AGREGAR CAMIÓN ---");
                    System.out.print("Marca: ");
                    String marcaCamion = scanner.nextLine();
                    
                    System.out.print("Modelo: ");
                    String modeloCamion = scanner.nextLine();
                    
                    System.out.print("Año: ");
                    int añoCamion = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Capacidad de carga (toneladas): ");
                    double capacidad = scanner.nextDouble();
                    scanner.nextLine();
                    
                    System.out.print("Número de ejes: ");
                    int ejes = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Tipo de camión (Liviano/Mediano/Pesado): ");
                    String tipoCamion = scanner.nextLine();
                    
                    System.out.print("¿Tiene refrigeración? (true/false): ");
                    boolean refrigeracion = scanner.nextBoolean();
                    scanner.nextLine();
                    
                    Camion nuevoCamion = new Camion(marcaCamion, modeloCamion, añoCamion, capacidad, ejes, tipoCamion, refrigeracion);
                    flotaVehiculos.add(nuevoCamion);
                    System.out.println("¡Camión agregado con éxito!");
                    break;
                    
                case 4:
                    // Mostrar todos los vehículos
                    if (flotaVehiculos.isEmpty()) {
                        System.out.println("\nNo hay vehículos registrados");
                    } else {
                        System.out.println("\n=== FLOTA DE VEHÍCULOS ===");
                        for (int i = 0; i < flotaVehiculos.size(); i++) {
                            System.out.println("\n--- Vehículo #" + (i+1) + " ---");
                            flotaVehiculos.get(i).mostrarInfo();
                        }
                    }
                    break;
                    
                case 5:
                    // Calcular costo mantenimiento de un vehículo específico
                    if (flotaVehiculos.isEmpty()) {
                        System.out.println("\nNo hay vehículos registrados");
                    } else {
                        System.out.println("\n=== VEHÍCULOS DISPONIBLES ===");
                        for (int i = 0; i < flotaVehiculos.size(); i++) {
                            System.out.println((i+1) + ". " + flotaVehiculos.get(i).marca + " " + 
                                             flotaVehiculos.get(i).modelo + " (" + 
                                             flotaVehiculos.get(i).getClass().getSimpleName() + ")");
                        }
                        
                        System.out.print("\nSeleccione el número del vehículo: ");
                        int seleccion = scanner.nextInt();
                        scanner.nextLine();
                        
                        if (seleccion >= 1 && seleccion <= flotaVehiculos.size()) {
                            Vehiculo vehiculoSeleccionado = flotaVehiculos.get(seleccion - 1);
                            double costo = vehiculoSeleccionado.calcularCostoMantenimiento();
                            System.out.println("\n--- COSTO DE MANTENIMIENTO ---");
                            System.out.println("Vehículo: " + vehiculoSeleccionado.marca + " " + vehiculoSeleccionado.modelo);
                            System.out.println("Costo anual de mantenimiento: $" + costo);
                        } else {
                            System.out.println("Selección no válida");
                        }
                    }
                    break;
                    
                case 6:
                    // Mostrar mantenimiento de toda la flota (polimorfismo en acción)
                    if (flotaVehiculos.isEmpty()) {
                        System.out.println("\nNo hay vehículos registrados");
                    } else {
                        System.out.println("\n=== COSTOS DE MANTENIMIENTO POR VEHÍCULO ===");
                        double totalMantenimiento = 0;
                        
                        for (int i = 0; i < flotaVehiculos.size(); i++) {
                            Vehiculo v = flotaVehiculos.get(i);
                            double costo = v.calcularCostoMantenimiento();
                            totalMantenimiento += costo;
                            System.out.println((i+1) + ". " + v.marca + " " + v.modelo + 
                                             " (" + v.getClass().getSimpleName() + "): $" + costo);
                        }
                        
                        System.out.println("\n--- TOTAL DE LA FLOTA ---");
                        System.out.println("Costo total de mantenimiento anual: $" + totalMantenimiento);
                        System.out.println("Promedio por vehículo: $" + (totalMantenimiento / flotaVehiculos.size()));
                    }
                    break;
                    
                case 7:
                    System.out.println("\n¡Sistema de vehículos cerrado!");
                    break;
                    
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion != 7);
        
        scanner.close();
    }
}