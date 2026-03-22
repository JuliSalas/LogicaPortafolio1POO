package cr.ac.ucenfotec.bl.entities;

/**
 * Representa a un paciente dentro del sistema.
 * Contiene información básica como nombre, cédula y teléfono.
 */
public class Paciente {

    private String nombre;
    private String cedula;
    private String telefono;

    /**
     * Constructor vacío.
     */
    public Paciente() {
    }

    /**
     * Constructor con parámetros.
     */
    public Paciente(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
