public abstract class Figura {
  
    abstract double calcularArea();
    abstract double calcularPerimetro();
    
    void mostrarInfo() {
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}