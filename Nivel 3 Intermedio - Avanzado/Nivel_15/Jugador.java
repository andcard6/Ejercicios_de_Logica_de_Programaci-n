public class Jugador {

    String nombre;
    int puntos;
    

    Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
    }
    

    void sumarPuntos(int puntosGanados) {
        puntos = puntos + puntosGanados;
    }
    

    void reiniciarPuntos() {
        puntos = 0;
    }

    
    void mostrarInfo() {
        System.out.println("Jugador: " + nombre);
        System.out.println("Puntos: " + puntos);
    }
    

    void mostrarEstado() {
        System.out.println(nombre + " - Puntos: " + puntos);
    }
}