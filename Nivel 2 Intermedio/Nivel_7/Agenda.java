
import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<Contacto> contactos;
    
    public Agenda() {
        this.contactos = new ArrayList<>();
    }
    
    // ========== MÉTODO VERIFICAR SI EXISTE ==========

    private boolean existeContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return true; 
            }
        }
        return false; 
    }
    
    // ========== MÉTODO AGREGAR CON VALIDACIÓN ==========
    public boolean agregarContacto(Contacto contacto) {
        
        if (existeContacto(contacto.getNombre())) {
            System.out.println("ERROR: Ya existe un contacto con el nombre '" 
                               + contacto.getNombre() + "'");
            return false;  
        }
        
        contactos.add(contacto);
        System.out.println("Contacto agregado exitosamente: " + contacto.getNombre());
        return true;
    }
    
    // ========== MÉTODO  ELIMINAR CONTACTO ==========

    public boolean eliminarContacto(String nombre) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(i);
                System.out.println("Contacto eliminado: " + nombre);
                return true;
            }
        }
        System.out.println("No se encontró el contacto: " + nombre);
        return false;
    }
    
    
    // ========== MÉTODO BUSCAR ==========
    public ArrayList<Contacto> buscarTodosPorNombre(String nombre) {
        ArrayList<Contacto> encontrados = new ArrayList<>();
        
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                encontrados.add(contacto);
            }
        }
        
        if (encontrados.isEmpty()) {
            System.out.println("No se encontró ningún contacto: " + nombre);
        } else {
            System.out.println("Encontrados " + encontrados.size() + " contacto(s):");
            for (Contacto c : encontrados) {
                c.mostrarInfo();
            }
        }
        return encontrados;
    }
    

// ========== MÉTODO LISTAR TODOS LOS CONTACTOS ==========

    public void listarTodos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía. No hay contactos.");
        } else {
            System.out.println("\n=== LISTA DE CONTACTOS ===");
            System.out.println("Total: " + contactos.size() + " contactos\n");
            
            for (Contacto contacto : contactos) {
                contacto.mostrarInfo();  // Muestra cada contacto
            }
        }
    }
    
    // ========== MÉTODO ADICIONAL: OBTENER TODOS ==========
    // Útil si necesitas trabajar con la lista completa
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
}