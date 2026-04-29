public class Vehiculo {

    String marca;
    String modelo;
    int año;
    

    Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    double calcularCostoMantenimiento() {
        return 0;
    }
    
    // Mostrar información básica del vehículo
    void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}