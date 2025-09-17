package vista;

import java.util.List;

import modelo.estudiante;

public class vistaEstudiante {
  public void mostrarInformacionEstudiantes(List<estudiante> estudiantes) {

    // for (Estudiante estudiante : estudiantes) {
    // System.out.println("Nombre: " + estudiante.getNombre());
    // System.out.println("Edad: " + estudiante.getEdad());
    // }

    estudiantes.forEach(estudiante -> {
      System.out.println("Nombre: " + estudiante.getNombre());
      System.out.println("Edad: " + estudiante.getEdad());
    });

  }
}