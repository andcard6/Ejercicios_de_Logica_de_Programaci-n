import java.util.Scanner;
import Funciones_Nivel_5.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            int categoria;
            int tipo;

            System.out.println("=========================================");
            System.out.println("         CONVERSOR DE UNIDADES");
            System.out.println("=========================================");
            System.out.println("1. Temperatura");
            System.out.println("2. Longitud");
            System.out.println("3. Peso");
            System.out.println("4. Tiempo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una categoría: ");
            categoria = scanner.nextInt();

            switch (categoria) {

                // ================= TEMPERATURA =================
                case 1:
                    System.out.println("\n¿Qué unidad desea convertir?");
                    System.out.println("1. Celsius");
                    System.out.println("2. Fahrenheit");
                    System.out.println("3. Kelvin");
                    System.out.print("Opción: ");
                    tipo = scanner.nextInt();

                    System.out.print("Ingrese valor: ");
                    double temperatura = scanner.nextDouble();

                    switch (tipo) {
                        case 1:
                            System.out.println("Fahrenheit: " + FuncionesConversion.celsiusAFahrenheit(temperatura));
                            System.out.println("Kelvin: " + FuncionesConversion.celsiusAKelvin(temperatura));
                            break;

                        case 2:
                            double celsius = FuncionesConversion.fahrenheitACelsius(temperatura);
                            System.out.println("Celsius: " + celsius);
                            System.out.println("Kelvin: " + FuncionesConversion.celsiusAKelvin(celsius));
                            break;

                        case 3:
                            double celsiusKelvin = FuncionesConversion.kelvinACelsius(temperatura);
                            System.out.println("Celsius: " + celsiusKelvin);
                            System.out.println("Fahrenheit: " + FuncionesConversion.celsiusAFahrenheit(celsiusKelvin));
                            break;

                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;

                // ================= LONGITUD =================
                case 2:
                    System.out.println("\n¿Qué unidad desea convertir?");
                    System.out.println("1. Metros");
                    System.out.println("2. Kilómetros");
                    System.out.println("3. Millas");
                    System.out.print("Opción: ");
                    tipo = scanner.nextInt();

                    System.out.print("Ingrese valor: ");
                    double longitud = scanner.nextDouble();

                    switch (tipo) {
                        case 1:
                            System.out.println("Kilómetros: " + FuncionesConversion.metrosAKilometros(longitud));
                            break;

                        case 2:
                            System.out.println("Metros: " + FuncionesConversion.kilometrosAMetros(longitud));
                            System.out.println("Millas: " + FuncionesConversion.kilometrosAMillas(longitud));
                            break;

                        case 3:
                            double km = FuncionesConversion.millasAKilometros(longitud);
                            System.out.println("Kilómetros: " + km);
                            System.out.println("Metros: " + FuncionesConversion.kilometrosAMetros(km));
                            break;

                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;

                // ================= PESO =================
                case 3:
                    System.out.println("\n¿Qué unidad desea convertir?");
                    System.out.println("1. Kilogramos");
                    System.out.println("2. Libras");
                    System.out.println("3. Onzas");
                    System.out.print("Opción: ");
                    tipo = scanner.nextInt();

                    System.out.print("Ingrese valor: ");
                    double peso = scanner.nextDouble();

                    switch (tipo) {
                        case 1:
                            System.out.println("Libras: " + FuncionesConversion.kilogramosALibras(peso));
                            System.out.println("Onzas: " + FuncionesConversion.kilogramosAOnzas(peso));
                            break;

                        case 2:
                            double kg = FuncionesConversion.librasAKilogramos(peso);
                            System.out.println("Kilogramos: " + kg);
                            System.out.println("Onzas: " + FuncionesConversion.kilogramosAOnzas(kg));
                            break;

                        case 3:
                            double kilogramos = FuncionesConversion.onzasAKilogramos(peso);
                            System.out.println("Kilogramos: " + kilogramos);
                            System.out.println("Libras: " + FuncionesConversion.kilogramosALibras(kilogramos));
                            break;

                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;

                // ================= TIEMPO =================
                case 4:
                    System.out.println("\n¿Qué unidad desea convertir?");
                    System.out.println("1. Segundos");
                    System.out.println("2. Minutos");
                    System.out.println("3. Horas");
                    System.out.print("Opción: ");
                    tipo = scanner.nextInt();

                    System.out.print("Ingrese valor: ");
                    double tiempo = scanner.nextDouble();

                    switch (tipo) {
                        case 1:
                            System.out.println("Minutos: " + FuncionesConversion.segundosAMinutos(tiempo));
                            System.out.println("Horas: " + FuncionesConversion.minutosAHoras(
                                    FuncionesConversion.segundosAMinutos(tiempo)));
                            break;

                        case 2:
                            System.out.println("Segundos: " + FuncionesConversion.minutosASegundos(tiempo));
                            System.out.println("Horas: " + FuncionesConversion.minutosAHoras(tiempo));
                            break;

                        case 3:
                            double minutos = FuncionesConversion.horasAMinutos(tiempo);
                            System.out.println("Minutos: " + minutos);
                            System.out.println("Segundos: " + FuncionesConversion.minutosASegundos(minutos));
                            break;

                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;

                // ================= SALIR =================
                case 5:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Categoría inválida.");
            }

            // Espera de 3 segundos antes de volver al menú
            if (continuar) {
                try {
                    System.out.println("\nRegresando al menú principal en 3 segundos...");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Error en la espera.");
                }

                // Limpiar visualmente consola
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
            }
        }

        scanner.close();
    }
}
