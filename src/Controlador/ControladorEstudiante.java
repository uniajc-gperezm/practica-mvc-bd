package Controlador;

import Modelo.Estudiante;
import Vista.VistaEstudiante;

public class ControladorEstudiante {
    private Estudiante modelo;
    private VistaEstudiante vista;

    public ControladorEstudiante (Estudiante modelo, VistaEstudiante vista){
        this.modelo = modelo;
        this.vista = vista;
    }

    public void setNombreEstudiante(String nombre) {
        this.modelo.setNombre(nombre);
    }

    public String getNombreEstudiante() {
        return this.modelo.getNombre();
    }

    public void setEdadEstudiante(int edad) {
        this.modelo.setEdad(edad);
    }

    public int getEdadEstudiante() {
        return this.modelo.getEdad();
    }
    public void actualizarVista(){
        vista.mostrarDetallesEstudiante(modelo.getNombre(), modelo.getEdad());
    }
}