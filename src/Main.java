import model.Student;
import view.StudentView;
import java.util.Scanner;
import controller.StudentController;

public class Main {
    
    public static void main(String[] args) throws Exception {

        String name;
        int age;
        Student student;
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(studentView);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to MVC Students");

        System.out.print("\nNombre del estudiante: ");
        name = scanner.nextLine();

        System.out.print("\nEdad del estudiante: ");
        age = scanner.nextInt();

        System.err.println();

        student = new Student(name, age);
        studentController.addStudent(student);
        studentController.updateView();

        scanner.close();
    }
}
