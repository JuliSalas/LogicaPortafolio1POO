package cr.ac.ucenfotec.bl.entities;

/**
 * Representa el detalle interno de una cita.
 * Esta clase permite aplicar composición, porque el detalle pertenece a la cita.
 */
public class DetalleCita {

    private String motivo;
    private String estado;

    public DetalleCita() {
        this.motivo = "Consulta general";
        this.estado = "Pendiente";
    }

    public DetalleCita(String motivo, String estado) {
        this.motivo = motivo;
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DetalleCita{" +
                "motivo='" + motivo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
