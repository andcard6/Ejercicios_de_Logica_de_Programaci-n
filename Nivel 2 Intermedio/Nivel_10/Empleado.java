public class Empleado {
    // Atributos
    String nombre;
    String ID;
    double salario;
    String departamento;
    
    Empleado(String nombre, String ID, double salario, String departamento) {
        this.nombre = nombre;
        this.ID = ID;
        this.salario = salario;
        this.departamento = departamento;
    }
    
    // Función para calcular salario anual
    double calcularSalarioAnual() {
        return salario * 12;
    }
    
    // Función para aplicar aumento porcentual
    void aplicarAumento(double porcentaje) {
        if (porcentaje > 0) {
            double aumento = salario * (porcentaje / 100);
            salario = salario + aumento;
            System.out.println("Aumento aplicado: " + porcentaje + "%");
            System.out.println("Aumento de: $" + aumento);
            System.out.println("Nuevo salario mensual: $" + salario);
        } else {
            System.out.println("El porcentaje debe ser positivo");
        }
    }
    
    // Mostrar información del empleado
    void mostrarInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario mensual: $" + salario);
        System.out.println("Salario anual: $" + calcularSalarioAnual());
        System.out.println("------------------------");
    }
}
