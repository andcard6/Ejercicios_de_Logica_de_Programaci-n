public class Circulo extends Figura {
    
    double radio;
    
    
    Circulo(double radio) {
        this.radio = radio;
    }
    
    // Implementación del método abstracto calcularArea
    double calcularArea() {
        double pi = 3.1416;  // Valor simple de pi
        return pi * radio * radio;
    }
    
    // Implementación del método abstracto calcularPerimetro
    double calcularPerimetro() {
        double pi = 3.1416;
        return 2 * pi * radio;
    }

    void mostrarInfo() {
        System.out.println("=== CÍRCULO ===");
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("----------------");
    }
}