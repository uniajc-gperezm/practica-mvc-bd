package ControladorEstudiante;
import Estudiante.Estudiante;
import Estudiante.VistaEstudiante.VistaEstudiante;

public class ControladorEstudiante {

    // Referencias a los objetos de las clases Estudiante (modelo) y VistaEstudiante (vista)
    private Estudiante modelo;
    private VistaEstudiante vista;

    // El constructor recibe el modelo y la vista
    public ControladorEstudiante(Estudiante modelo, VistaEstudiante vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    // Métodos para interactuar con el modelo (Estudiante)
    public void setNombreEstudiante(String nombre) {
        modelo.setNombre(nombre);
    }

    public String getNombreEstudiante() {
        return modelo.getNombre();
    }

    public void setEdadEstudiante(int edad) {
        modelo.setEdad(edad);
    }

    public int getEdadEstudiante() {
        return modelo.getEdad();
    }

    // Método para actualizar la vista con los datos del modelo
    public void actualizarVista() {
        vista.mostrarDetallesEstudiante(modelo.getNombre(), modelo.getEdad());
    }
}