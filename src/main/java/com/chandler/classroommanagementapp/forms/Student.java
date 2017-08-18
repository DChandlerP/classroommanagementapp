package com.chandler.classroommanagementapp.forms;

import javax.persistence.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by davidprince on 7/31/17.
 */
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    @Embedded
    private Person student;

    @NotNull
    private Integer studentID;

    @ManyToOne
    private Classroom classroom;

    public Student() {
    }

    public Student(Integer id, Person student, Integer studentID, Classroom classroom) {
        this.id = id;
        this.student = student;
        this.studentID = studentID;
        this.classroom = classroom;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}





