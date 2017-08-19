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

    @NotNull
    private Integer studentID;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @ManyToOne
    private Classroom classroom;

    public Student() {
    }

    public Student(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "Student ID: " + studentID +
                " " + firstName +
                " " + lastName +
                " Class " + classroom;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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





