package vista;

import java.util.List;

import modelo.Estudiante;

public class VistaEstudiante {
  public void mostrarInformacionEstudiantes(List<Estudiante> estudiantes) {
    estudiantes.forEach(estudiante -> {
      System.out.println("------------------------------------");
      System.out.println("Nombre : " + estudiante.getNombre());
      System.out.println("Edad: " + estudiante.getEdad());
      System.out.println("-------------------------------------");
    });

  }
}
