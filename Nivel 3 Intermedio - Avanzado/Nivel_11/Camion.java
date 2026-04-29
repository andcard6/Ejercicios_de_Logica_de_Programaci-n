public class Camion extends Vehiculo {

    double capacidadCarga; // en toneladas
    int numeroEjes;
    String tipoCamion; // Liviano, Mediano, Pesado
    boolean tieneRefrigeracion;
    

    Camion(String marca, String modelo, int año, double capacidadCarga, int numeroEjes, String tipoCamion, boolean tieneRefrigeracion) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
        this.tieneRefrigeracion = tieneRefrigeracion;
    }
    
    // Implementación del método polimórfico
    double calcularCostoMantenimiento() {
        double costoBase = 500;
        
        // Capacidad de carga afecta el costo
        if (capacidadCarga > 20) {
            costoBase += 300;
        } else if (capacidadCarga > 10) {
            costoBase += 200;
        } else if (capacidadCarga > 5) {
            costoBase += 100;
        }
        
        // Número de ejes aumenta el costo
        costoBase += (numeroEjes - 2) * 80;
        
        // Tipo de camión
        if (tipoCamion.equals("Pesado")) {
            costoBase += 250;
        } else if (tipoCamion.equals("Mediano")) {
            costoBase += 150;
        }
        
        if (tieneRefrigeracion) {
            costoBase += 200;
        }
        
        int antiguedad = 2026 - año;
        costoBase += antiguedad * 50;
        
        return costoBase;
    }
    
    // Mostrar información completa del Camión
    void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Camión");
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
        System.out.println("Número de ejes: " + numeroEjes);
        System.out.println("Tipo de camión: " + tipoCamion);
        System.out.println("Refrigeración: " + (tieneRefrigeracion ? "Sí" : "No"));
        System.out.println("Costo mantenimiento: $" + calcularCostoMantenimiento());
    }
}