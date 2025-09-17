import java.util.Scanner;

import Controlador.ControladorEstudiante;
import Modelo.Estudiante;
import Vista.VistaEstudiante;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Estudiante estudiante = new Estudiante(" ", 0);

        VistaEstudiante vista = new VistaEstudiante();

        ControladorEstudiante controlador = new ControladorEstudiante(estudiante, vista);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        controlador.setNombreEstudiante(nombre);

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();
        controlador.setEdadEstudiante(edad);

        // Mostrar datos ingresados
        controlador.actualizarVista();
}
}
