package controlador;
import modelo.Estudiante;
import vista.VistaEstudiante;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControladorEstudiante {
    
    private Estudiante modelo;
    private VistaEstudiante vista;
    private ArrayList estudiantes;

    public ControladorEstudiante (VistaEstudiante vista){
        this.vista = vista;
        this.estudiantes = new ArrayList<>();
    }

    public void actualizarVista() {
        vista.mostrarInformacionEstudiantes(estudiantes);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        actualizarVista();
    }

    


    


}