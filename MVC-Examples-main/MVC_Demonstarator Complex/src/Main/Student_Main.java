/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Model.Student;
import MVC_View.StudentView;
import MVC_Controller.StudentController;

public class Student_Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setRollNumber("fa22-bse-013");
        student.setName("Ayyan Khan");
        student.setSubjects(new String[]{"Math", "DataBase", "Programming"});
        student.setMarks(92.5);
        student.setGpa(4.0);

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();
    }
}

