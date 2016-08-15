/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Blue
 */
@Named(value = "myMB")
@RequestScoped
public class myMB {
    
    private int studentID;
    private Student student;
    /**
     * Creates a new instance of myMB
     */
    public myMB() {
        student= new Student();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public void deleteStudent() {
        MyPersister myPersister = new MyPersister("tableRelationPU");
        myPersister.remove(studentID);
        
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    
}
