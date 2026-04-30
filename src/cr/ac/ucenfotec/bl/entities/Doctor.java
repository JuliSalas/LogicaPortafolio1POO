package cr.ac.ucenfotec.bl.entities;

/**
 * Representa a un doctor dentro del sistema.
 * Incluye su especialidad y código identificador.
 */
public class Doctor extends Persona implements Identificable {

    private String codigo;
    private String especialidad;

    public Doctor() {
    }

    /**
     * Constructor con parámetros.
     */
    public Doctor(String nombre, String codigo, String especialidad) {
        super(nombre);
        this.codigo = codigo;
        this.especialidad = especialidad;
    }

    @Override
    public String obtenerIdentificador() {
        return codigo;
    }

    @Override
    public String obtenerTipo() {
        return "Doctor";
    }

    public String getCodigo() {

        return codigo;
    }

    public void setCodigo(String codigo) {

        this.codigo = codigo;
    }

    public String getEspecialidad() {

        return especialidad;
    }

    public void setEspecialidad(String especialidad) {

        this.especialidad = especialidad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Doctor other = (Doctor) obj;

        return this.getCodigo() != null &&
                this.getCodigo().equals(other.getCodigo());
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "nombre='" + getNombre() + '\'' +
                ", codigo='" + codigo + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
