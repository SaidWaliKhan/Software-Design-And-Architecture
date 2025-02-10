/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_Controller;
import Model.Student;
import MVC_View.StudentView;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setRollNumber(String rollNumber) {
        model.setRollNumber(rollNumber);
    }

    public String getRollNumber() {
        return model.getRollNumber();
    }

    public void setSubjects(String[] subjects) {
        model.setSubjects(subjects);
    }

    public String[] getSubjects() {
        return model.getSubjects();
    }

    public void setMarks(double marks) {
        model.setMarks(marks);
    }

    public double getMarks() {
        return model.getMarks();
    }

    public void setGpa(double gpa) {
        model.setGpa(gpa);
    }

    public double getGpa() {
        return model.getGpa();
    }

    public void updateView() {
        view.printStudentDetails(model.getRollNumber(), model.getName(), model.getSubjects(), model.getMarks(), model.getGpa());
    }
}

