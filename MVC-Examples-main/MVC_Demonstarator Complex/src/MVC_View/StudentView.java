/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_View;

public class StudentView {
    public void printStudentDetails(String rollNumber, String name, String[] subjects, double marks, double gpa) {
        System.out.println("Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Subjects: ");
        for (String subject : subjects) {
            System.out.println(" - " + subject);
        }
        System.out.println("Marks: " + marks);
        System.out.println("GPA: " + gpa);
    }
}

