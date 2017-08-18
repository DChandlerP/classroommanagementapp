package com.chandler.classroommanagementapp.forms;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidprince on 7/31/17.
 */
@Entity
public class Classroom {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @OneToMany
    @JoinColumn(name = "classroom_id")
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public Classroom(int id, List<Student> students) {
        this.id = id;
        this.students = students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Classroom() {
    }

    public int getId() {
        return id;
    }
}
