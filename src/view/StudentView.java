package view;

import java.util.List;

public class StudentView {

    public void showInformation(List<model.Student> Students) {
        Students.forEach(student -> {
            System.out.println("Nombre: " + student.getName());
            System.out.println("Edad: " + student.getAge());
        });
    }
}
