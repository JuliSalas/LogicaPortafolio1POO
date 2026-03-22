package cr.ac.ucenfotec.bl.entities;

/**
 * Representa una cita médica.
 * Relaciona un paciente con un doctor en una fechaHora
 */
public class Cita {

    private Paciente paciente;
    private Doctor doctor;
    private String fechaHora;

    public Cita() {
    }

    /**
     * Constructor con parámetros.
     */
    public Cita(Paciente paciente, Doctor doctor, String fechaHora) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.fechaHora = fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }


    @Override
    public String toString() {
        return "Cita{" +
                "paciente=" + paciente.getNombre() +
                ", doctor=" + doctor.getNombre() +
                ", fechaHora='" + fechaHora + '\'' +
                '}';
    }
}
