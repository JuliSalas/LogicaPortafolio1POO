package cr.ac.ucenfotec.bl.logic;

import cr.ac.ucenfotec.bl.entities.Cita;
import cr.ac.ucenfotec.bl.entities.Doctor;
import cr.ac.ucenfotec.bl.entities.Paciente;
import cr.ac.ucenfotec.bl.entities.Persona;
import cr.ac.ucenfotec.dl.Data;

import java.util.ArrayList;

/**
 * Clase encargada de gestionar la lógica del sistema.
 * Permite registrar, buscar y listar pacientes, doctores y citas.
 */
public class AdminSistema {

    public ArrayList<Persona> listarPersonas() {
        return Data.listarPersonas();
    }

    /**
     * Registra un nuevo paciente en el sistema.
     */
    public void registrarPaciente(String nombre, String cedula, String telefono) {
        Paciente nuevo = new Paciente(nombre, cedula, telefono);
        Data.pacientes.add(nuevo);
    }

    /**
     * Devuelve la lista de pacientes registrados.
     */
    public ArrayList<Paciente> listarPacientes() {
        return Data.pacientes;
    }

    /**
     * Busca un paciente por su cédula.
     */
    public Paciente buscarPacientePorCedula(String cedula) {
        for (Paciente p : Data.pacientes) {
            if (p.getCedula().equals(cedula)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Registra un nuevo doctor en el sistema.
     */
    public void registrarDoctor(String nombre, String codigo, String especialidad) {
        Doctor nuevo = new Doctor(nombre, codigo, especialidad);
        Data.doctores.add(nuevo);
    }

    /**
     * Devuelve la lista de doctores registrados.
     */
    public ArrayList<Doctor> listarDoctores() {
        return Data.doctores;
    }

    /**
     * Busca un doctor por su código.
     */
    public Doctor buscarDoctorPorCodigo(String codigo) {
        for (Doctor d : Data.doctores) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            }
        }
        return null;
    }

    /**
     * Crea una nueva cita médica.
     */
    public void crearCita(Paciente paciente, Doctor doctor, String fechaHora) {
        Cita nueva = new Cita(paciente, doctor, fechaHora);
        Data.citas.add(nueva);
    }

    public void crearCita(Paciente paciente, Doctor doctor, String fechaHora, String motivo) {
        Cita nueva = new Cita(paciente, doctor, fechaHora, motivo);
        Data.registrarCita(nueva);
    }

    /**
     * Devuelve la lista de citas registradas.
     */
    public ArrayList<Cita> listarCitas() {

        return Data.citas;
    }
}
