import modelo.*;
import vista.*;
import controlador.controladorEstudiante;

import java.util.List;
import java.util.Scanner;

import controlador.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Modelo-Vista-Controlador (MVC)");

    Scanner sc = new Scanner(System.in);
    Estudiante estudiante = new Estudiante("Juan", 20);
    vistaEstudiante vista = new vistaEstudiante();
    controladorEstudiante controlador = new controladorEstudiante(vista);
    controlador.agregarEstudiante(estudiante);

    System.out.println("Ingrese Estudiante:");
    String nombre = sc.nextLine();
    estudiante.setNombre(nombre);
    
    System.out.println("Ingrese edad:");
    int edad = sc.nextInt();
    estudiante.setEdad(edad);
    sc.nextLine(); 
    
    System.out.println("*******");
    System.out.println("Estudiante ingresado:");
   // controlador.agregarEstudiante(estudiante);
    vista.mostrarInformacionEstudiantes(List.of(estudiante));
    
    }
}

