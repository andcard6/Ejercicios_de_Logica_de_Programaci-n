import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
        
        int opcion;
        do {
            System.out.println("\n=== SISTEMA DE FIGURAS GEOMÉTRICAS ===");
            System.out.println("1. Agregar Círculo");
            System.out.println("2. Agregar Rectángulo");
            System.out.println("3. Agregar Triángulo");
            System.out.println("4. Mostrar todas las figuras");
            System.out.println("5. Calcular área total");
            System.out.println("6. Calcular perímetro total");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            
            if (opcion == 1) {
                System.out.print("Radio del círculo: ");
                double radio = scanner.nextDouble();
                Circulo c = new Circulo(radio);
                listaFiguras.add(c);
                System.out.println("Círculo agregado!");
                
            } else if (opcion == 2) {
                System.out.print("Base del rectángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Altura del rectángulo: ");
                double altura = scanner.nextDouble();
                Rectangulo r = new Rectangulo(base, altura);
                listaFiguras.add(r);
                System.out.println("Rectángulo agregado!");
                
            } else if (opcion == 3) {
                System.out.print("Lado 1 del triángulo: ");
                double l1 = scanner.nextDouble();
                System.out.print("Lado 2 del triángulo: ");
                double l2 = scanner.nextDouble();
                System.out.print("Lado 3 del triángulo: ");
                double l3 = scanner.nextDouble();
                Triangulo t = new Triangulo(l1, l2, l3);
                if (t.esValido()) {
                    listaFiguras.add(t);
                    System.out.println("Triángulo agregado!");
                } else {
                    System.out.println("Triángulo no válido!");
                }
                
            } else if (opcion == 4) {
                if (listaFiguras.isEmpty()) {
                    System.out.println("No hay figuras");
                } else {
                    for (int i = 0; i < listaFiguras.size(); i++) {
                        System.out.println("\nFigura " + (i+1));
                        if (listaFiguras.get(i) instanceof Circulo) {
                            ((Circulo)listaFiguras.get(i)).mostrarInfo();
                        } else if (listaFiguras.get(i) instanceof Rectangulo) {
                            ((Rectangulo)listaFiguras.get(i)).mostrarInfo();
                        } else if (listaFiguras.get(i) instanceof Triangulo) {
                            ((Triangulo)listaFiguras.get(i)).mostrarInfo();
                        }
                    }
                }
                
            } else if (opcion == 5) {
                double total = 0;
                for (int i = 0; i < listaFiguras.size(); i++) {
                    total = total + listaFiguras.get(i).calcularArea();
                }
                System.out.println("Área total: " + total);
                
            } else if (opcion == 6) {
                double total = 0;
                for (int i = 0; i < listaFiguras.size(); i++) {
                    total = total + listaFiguras.get(i).calcularPerimetro();
                }
                System.out.println("Perímetro total: " + total);
                
            } else if (opcion == 7) {
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Opción no válida");
            }
            
        } while(opcion != 7);
        
        scanner.close();
    }
}