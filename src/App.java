import java.util.Scanner;

import Controlador.ControladorEstudiante;
import Modelo.Estudiante;
import Vista.VistaEstudiante;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("********** Aplicacion MVC - Estudiante **********");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        Estudiante modelo = new Estudiante(nombre, edad);
        VistaEstudiante vista = new VistaEstudiante();
        ControladorEstudiante controlador = new ControladorEstudiante(modelo, vista);
        controlador.actualizarVista();
        // scanner.close();
        scanner.close();
    }
}
