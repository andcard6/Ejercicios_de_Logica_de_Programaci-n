public class Triangulo extends Figura {
    
    double lado1;
    double lado2;
    double lado3;
    

    Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    // Implementación del método abstracto calcularArea
    double calcularArea() {
        double semiperimetro  = (lado1 + lado2 + lado3) / 2;
        double producto = semiperimetro  * (semiperimetro  - lado1) * (semiperimetro  - lado2) * (semiperimetro  - lado3);
        return Math.sqrt(producto);  // Este Math.sqrt sí es necesario, es normal usarlo
    }
    
    // Implementación del método abstracto calcularPerimetro
    double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    // Validar si es un triángulo válido
    boolean esValido() {
        return (lado1 + lado2 > lado3) && 
               (lado1 + lado3 > lado2) && 
               (lado2 + lado3 > lado1);
    }
    
    void mostrarInfo() {
        System.out.println("=== TRIÁNGULO ===");
        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        if (esValido()) {
            System.out.println("Área: " + calcularArea());
            System.out.println("Perímetro: " + calcularPerimetro());
        } else {
            System.out.println("¡Triángulo no válido!");
        }
        System.out.println("----------------");
    }
}