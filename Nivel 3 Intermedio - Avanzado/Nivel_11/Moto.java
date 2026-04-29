public class Moto extends Vehiculo {
    
    int cilindrada; // cc (ej: 125, 250, 500, 1000)
    String tipoMoto; // Deportiva, Cruiser, Enduro, Scooter
    boolean tieneBaul;
    
    // Constructor
    Moto(String marca, String modelo, int año, int cilindrada, String tipoMoto, boolean tieneBaul) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
        this.tipoMoto = tipoMoto;
        this.tieneBaul = tieneBaul;
    }
    
    // Implementación del método polimórfico
    double calcularCostoMantenimiento() {
        double costoBase = 100;
        
        // Motos más grandes = más costo
        if (cilindrada > 1000) {
            costoBase += 120;
        } else if (cilindrada > 600) {
            costoBase += 80;
        } else if (cilindrada > 250) {
            costoBase += 50;
        }
        
        // Tipo de moto afecta el costo
        if (tipoMoto.equals("Deportiva")) {
            costoBase += 70;
        } else if (tipoMoto.equals("Enduro")) {
            costoBase += 60;
        } else if (tipoMoto.equals("Cruiser")) {
            costoBase += 40;
        }
        
        if (tieneBaul) {
            costoBase += 10;
        }
        
        int antiguedad = 2026 - año;
        costoBase += antiguedad * 10;
        
        return costoBase;
    }
    
    // Mostrar información completa de la Moto
    void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Moto");
        System.out.println("Cilindrada: " + cilindrada + "cc");
        System.out.println("Tipo de moto: " + tipoMoto);
        System.out.println("Baúl: " + (tieneBaul ? "Sí" : "No"));
        System.out.println("Costo mantenimiento: $" + calcularCostoMantenimiento());
    }
}