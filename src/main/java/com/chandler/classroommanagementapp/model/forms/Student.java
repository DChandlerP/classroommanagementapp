package com.chandler.classroommanagementapp.model.forms;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by davidprince on 7/31/17.
 */
@Entity
@Table(name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue
    private Integer primaryKey;

    @Embedded
    private Person student;

    @NotNull
    private Integer studentID;

    @ManyToOne
    private Integer classNumber;

    public Student(){}

    public Student(Integer primaryKey, Person student, Integer studentID, Integer classNumber) {
        this.primaryKey = primaryKey;
        this.student = student;
        this.studentID = studentID;
        this.classNumber = classNumber;
    }

    public Integer getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Integer primaryKey) {
        this.primaryKey = primaryKey;
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

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }
}
