package cr.ac.ucenfotec.dl;

import cr.ac.ucenfotec.bl.entities.Cita;
import cr.ac.ucenfotec.bl.entities.Doctor;
import cr.ac.ucenfotec.bl.entities.Paciente;
import cr.ac.ucenfotec.bl.entities.Persona;

import java.util.ArrayList;

/**
// Esta clase almacena los datos del sistema en memoria.
**/

public class Data {

    public static ArrayList<Paciente> pacientes = new ArrayList<>();
    public static ArrayList<Doctor> doctores = new ArrayList<>();
    public static ArrayList<Cita> citas = new ArrayList<>();

    public static void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public static ArrayList<Paciente> listarPacientes() {
        return pacientes;
    }

    public static void registrarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    public static ArrayList<Doctor> listarDoctores() {
        return doctores;
    }

    public static void registrarCita(Cita cita) {
        citas.add(cita);
    }

    public static ArrayList<Cita> listarCitas() {
        return citas;
    }

    public static ArrayList<Persona> listarPersonas() {
        ArrayList<Persona> personas = new ArrayList<>();

        personas.addAll(pacientes);
        personas.addAll(doctores);

        return personas;
    }
}
