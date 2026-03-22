package cr.ac.ucenfotec.dl;

import cr.ac.ucenfotec.bl.entities.Cita;
import cr.ac.ucenfotec.bl.entities.Doctor;
import cr.ac.ucenfotec.bl.entities.Paciente;

import java.util.ArrayList;

// Modularidad:
// Esta clase almacena los datos del sistema en memoria.
public class Data {

    public static ArrayList<Paciente> pacientes = new ArrayList<>();
    public static ArrayList<Doctor> doctores = new ArrayList<>();
    public static ArrayList<Cita> citas = new ArrayList<>();
}
