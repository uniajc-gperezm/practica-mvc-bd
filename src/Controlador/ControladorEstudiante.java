package Controlador;

import Modelo.Estudiante;
import Vista.VistaEstudiante;

public class ControladorEstudiante {

    private Estudiante Estudiante;
    private VistaEstudiante VistaEstudiante;

    public Estudiante getEstudiante() {
        return this.Estudiante;
    }

    public void setEstudiante(Estudiante Estudiante) {
        this.Estudiante = Estudiante;
    }

    public VistaEstudiante getVistaEstudiante() {
        return this.VistaEstudiante;
    }

    public void setVistaEstudiante(VistaEstudiante VistaEstudiante) {
        this.VistaEstudiante = VistaEstudiante;
    }

    public void actualizarVista(){
        
    }

}
