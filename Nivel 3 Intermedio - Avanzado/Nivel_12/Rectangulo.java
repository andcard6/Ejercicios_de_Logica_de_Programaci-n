public class Rectangulo extends Figura {

    double base;
    double altura;
    

    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Implementación del método abstracto calcularArea
    double calcularArea() {
        return base * altura;
    }
    
    // Implementación del método abstracto calcularPerimetro
    double calcularPerimetro() {
        return 2 * (base + altura);
    }
    

    void mostrarInfo() {
        System.out.println("=== RECTÁNGULO ===");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("----------------");
    }
}