package com.chandler.classroommanagementapp.model.forms;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/**
 * Created by davidprince on 7/31/17.
 */
public class Classroom {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @OneToMany
    private Classroom classNumber;

    public Classroom() {
    }

    public Classroom(int id, Classroom classNumber) {
        this.id = id;
        this.classNumber = classNumber;
    }

    public int getId() {
        return id;
    }
}
