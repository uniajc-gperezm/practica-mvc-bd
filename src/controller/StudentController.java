package controller;

import java.util.ArrayList;
import java.util.List;

import model.Student;
import view.StudentView;

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
        updateView();
    }
}
