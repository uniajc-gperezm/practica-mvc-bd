package vista;
import modelo.Estudiante;
import java.util.List;

public class VistaEstudiante {

    public void mostrarInformacionEstudiantes(List<Estudiante> estudiantes) 
    {
        estudiantes.forEach(estudiante -> {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
        });
       
}
}