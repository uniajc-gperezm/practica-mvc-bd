package controlador;
import modelo.Estudiante;
import java.util.List;
import java.util.ArrayList;
public class controladorEstudiante {
    
    private vista.VistaEstudiante vista;
    private List<Estudiante> estudiantes;
    
    public controladorEstudiante(vista.VistaEstudiante vista) {
        this.vista = vista;
        this.estudiantes = new ArrayList<Estudiante>();
    }
    public void actualizarVista() {
        vista.mostrarInformacionEstudiantes(estudiantes);
    }
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        actualizarVista();
    }
}
