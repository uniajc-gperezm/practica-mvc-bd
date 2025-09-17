import modelo.*;
import controlador.*;
import vista.*;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("MVC Estudiantes bienvienido!");
    
    Estudiante estudiante1 = new Estudiante("Alejandra", 21);
    VistaEstudiante vista = new VistaEstudiante();
    ControladorEstudiante controlador = new ControladorEstudiante(vista);
     
    
    //Se va a agregar el apellido
    estudiante1.setNombre("Alejandra Rivera");
    controlador.agregarEstudiante(estudiante1);


    
    

    

  }
}
