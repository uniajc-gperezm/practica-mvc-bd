package Estudiante.VistaEstudiante.Aplicacion;
import ControladorEstudiante.ControladorEstudiante;
import Estudiante.Estudiante;
import Estudiante.VistaEstudiante.VistaEstudiante;

public class Main {

    public static void main(String[] args) {

        
        Estudiante modelo = new Estudiante("Juan Pérez", 20);

        
        VistaEstudiante vista = new VistaEstudiante();

        
        ControladorEstudiante controlador = new ControladorEstudiante(modelo, vista);

        
        System.out.println("Datos iniciales:");
        controlador.actualizarVista();

        
        System.out.println("\nModificando los datos del estudiante...");
        controlador.setNombreEstudiante("Ana López");
        controlador.setEdadEstudiante(22);

        
        System.out.println("Datos después de la modificación:");
        controlador.actualizarVista();
    }
}