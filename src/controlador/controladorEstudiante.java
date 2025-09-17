package controlador;

import modelo.Estudiante;
import vista.vistaEstudiante;

import java.util.ArrayList;
import java.util.List;

public class controladorEstudiante {
  private vistaEstudiante vista;
  private List<Estudiante> estudiantes;

  public controladorEstudiante(vistaEstudiante vista) {
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
