package cr.ac.ucenfotec.bl.entities;

/**
 * Representa a un doctor dentro del sistema.
 * Incluye su especialidad y código identificador.
 */
public class Doctor {

    private String nombre;
    private String codigo;
    private String especialidad;

    public Doctor() {
    }

    /**
     * Constructor con parámetros.
     */
    public Doctor(String nombre, String codigo, String especialidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public String toString() {
        return "Doctor{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
