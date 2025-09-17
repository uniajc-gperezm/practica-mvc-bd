package controller;

import model.Student;
import java.util.List;
import view.StudentView;
import java.util.ArrayList;

public class StudentController {

    private StudentView studentvView;
    private List<Student> students;

    public StudentController(StudentView studentvView) {
        this.studentvView = studentvView;
        this.students = new ArrayList<>();
    }

    public void updateView() {
        studentvView.showInformation(students);
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
