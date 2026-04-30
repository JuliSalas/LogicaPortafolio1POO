package cr.ac.ucenfotec.bl.entities;

/**
 * Clase abstracta que representa una persona dentro del sistema.
 * Permite aplicar herencia, abstracción y polimorfismo.
 */
public abstract class Persona {

    protected String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public abstract String obtenerIdentificador();

    public abstract String obtenerTipo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
