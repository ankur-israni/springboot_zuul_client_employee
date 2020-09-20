package com.ankur.zuul.domain;


import java.util.Collection;

public class EmployeeListAllResponse {


    private Collection<Employee> employees;

    public EmployeeListAllResponse(Collection<Employee> employees) {
        this.employees = employees;
    }

    public Collection<Employee> getEmployees() {
        return employees;
    }
}
