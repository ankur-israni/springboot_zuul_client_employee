package com.ankur.zuul.domain;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class EmployeeListAllRequest {

    @Valid
    @NotNull(message="Username is required")
    private String username;

    @Valid
    @NotNull(message="Password is required")
    private String password;

    public EmployeeListAllRequest(String username, String password){
        this.username=username;
        this.password=password;
    }

    public EmployeeListAllRequest(){
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
}
