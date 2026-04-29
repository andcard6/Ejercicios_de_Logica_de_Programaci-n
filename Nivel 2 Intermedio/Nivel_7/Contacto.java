public class Contacto {

    public String nombre;
    public String telefono;
    public String correo;

public Contacto(String nombre, String telefono, String correo) {
    this.nombre = nombre;
    this.telefono = telefono;
    this.correo = correo;

}

public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void mostrarInfo() {
        System.out.println(" Contacto:");
        System.out.println("   Nombre: " + nombre);
        System.out.println("   Teléfono: " + telefono);
        System.out.println("   Correo: " + correo);
        System.out.println("   -------------------------");
    }

}