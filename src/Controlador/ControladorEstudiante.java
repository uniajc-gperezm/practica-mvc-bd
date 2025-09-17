package controlador;
import java.util.ArrayList;
import java.util.List;

import vista.VistaEstudiante;
import modelo.Estudiante;

public class ControladorEstudiante {
    private List<Estudiante> estudiantes;
    private VistaEstudiante vista;

    public ControladorEstudiante (Estudiante modelo, VistaEstudiante vista){
        this.vista = vista;
        this.estudiantes = new ArrayList<Estudiante>();

    }
    public void actualizarVista(){
        vista.mostrarDetallesEstudiante(estudiantes);
    }
    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

   
}