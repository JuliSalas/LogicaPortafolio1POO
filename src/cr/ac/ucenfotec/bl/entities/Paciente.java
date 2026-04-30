package cr.ac.ucenfotec.bl.entities;

/**
 * Representa a un paciente dentro del sistema.
 * Contiene información básica como nombre, cédula y teléfono.
 */
public class Paciente extends Persona implements Identificable {

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
        super(nombre);
        this.cedula = cedula;
        this.telefono = telefono;
    }

    @Override
    public String obtenerIdentificador() {
        return cedula;
    }

    @Override
    public String obtenerTipo() {
        return "Paciente";
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Paciente other = (Paciente) obj;

        return this.getCedula() != null &&
                this.getCedula().equals(other.getCedula());
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
