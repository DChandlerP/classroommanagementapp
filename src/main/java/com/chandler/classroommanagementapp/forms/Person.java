package com.chandler.classroommanagementapp.forms;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by davidprince on 7/31/17.
 */
@Embeddable
public class Person {
    @Column
    private String firstName;

    @Column
    private String middleName;

    @Column
    private String lastName;

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
