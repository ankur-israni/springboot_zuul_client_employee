package com.ankur.zuul.domain;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Employee {

    @Valid
    @NotNull(message="ID is required")
    private Integer id;

    @Valid
    @NotNull(message="Firstname is required")
    private String firstName;

    @Valid
    @NotNull(message="Lastname is required")
    private String lastName;

    public Employee(Integer id, String firstName, String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Employee(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
