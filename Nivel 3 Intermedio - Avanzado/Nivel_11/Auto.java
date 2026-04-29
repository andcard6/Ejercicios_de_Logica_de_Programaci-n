public class Auto extends Vehiculo {

    int numeroPuertas;
    String tipoCombustible; // Gasolina, Diesel, Eléctrico, Híbrido
    boolean tieneAireAcondicionado;
    

    Auto(String marca, String modelo, int año, int numeroPuertas, String tipoCombustible, boolean tieneAireAcondicionado) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    
    // Implementación del método polimórfico 
    double calcularCostoMantenimiento() {
        double costoBase = 200;
        
        // Factores que afectan el costo
        if (tipoCombustible.equals("Eléctrico")) {
            costoBase += 50;
        } else if (tipoCombustible.equals("Híbrido")) {
            costoBase += 80;
        } else if (tipoCombustible.equals("Diesel")) {
            costoBase += 100;
        }
        
        if (tieneAireAcondicionado) {
            costoBase += 30;
        }
        
        if (numeroPuertas > 4) {
            costoBase += 40;
        }
        
        int antiguedad = 2026 - año;
        costoBase += antiguedad * 15;
        
        return costoBase;
    }
    
    void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Auto");
        System.out.println("Puertas: " + numeroPuertas);
        System.out.println("Combustible: " + tipoCombustible);
        System.out.println("Aire Acondicionado: " + (tieneAireAcondicionado ? "Sí" : "No"));
        System.out.println("Costo mantenimiento: $" + calcularCostoMantenimiento());
    }
}