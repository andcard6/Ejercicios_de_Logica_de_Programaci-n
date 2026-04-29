

class CuentaBancaria {
    // Atributos
    String titular;
    double saldo;
    String numeroCuenta;
    
    // Constructor
    CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        
        // Validar que el saldo inicial no sea negativo
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial no puede ser negativo. Se estableció en 0.");
        }
    }
    
    // Método para depositar
    void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }
    
    // Método para retirar
    void retirar(double monto) {
        if (monto > 0) {
            if (saldo - monto >= 0) {
                saldo = saldo - monto;
                System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
            } else {
                System.out.println("Error: No hay suficiente saldo. Saldo actual: $" + saldo);
            }
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }
    
    // Método para consultar saldo
    void consultarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }
}