import modelo.*;
import controlador.*;
import vista.*;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("MVC Estudiantes bienvienido!");
    
    Estudiante estudiante1 = new Estudiante("Alejandra", 21);
    VistaEstudiante vista = new VistaEstudiante();
    ControladorEstudiante controlador = new ControladorEstudiante(vista);
     
    controlador.agregarEstudiante(estudiante1);

    controlador.actualizarVista();
    

    

  }
}
