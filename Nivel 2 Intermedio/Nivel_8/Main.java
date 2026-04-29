import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear una cuenta
        System.out.println("=== CREAR CUENTA BANCARIA ===");
        System.out.print("Ingrese el titular: ");
        String titular = scanner.nextLine();
        
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        
        System.out.print("Ingrese el saldo inicial: $");
        double saldoInicial = scanner.nextDouble();
        
        CuentaBancaria miCuenta = new CuentaBancaria(titular, numeroCuenta, saldoInicial);
        
        int opcion;
        do {
            // Menú de opciones
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.print("Monto a depositar: $");
                    double deposito = scanner.nextDouble();
                    miCuenta.depositar(deposito);
                    break;
                    
                case 2:
                    System.out.print("Monto a retirar: $");
                    double retiro = scanner.nextDouble();
                    miCuenta.retirar(retiro);
                    break;
                    
                case 3:
                    miCuenta.consultarSaldo();
                    break;
                    
                case 4:
                    System.out.println("¡Gracias por usar el sistema bancario!");
                    break;
                    
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion != 4);
        
        scanner.close();
    }
}