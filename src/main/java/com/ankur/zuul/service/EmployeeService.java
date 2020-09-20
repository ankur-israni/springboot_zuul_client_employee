package com.ankur.zuul.service;



import com.ankur.zuul.domain.Employee;
import com.ankur.zuul.domain.EmployeeListAllResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {

    private Map<Integer, Employee> db = new HashMap<>();


    public EmployeeService() {
        db.put(1, new Employee(1, "ankur","israni"));
        db.put(2, new Employee(2, "barack","obama"));
        db.put(3, new Employee(3, "ravi","shastri"));
        db.put(4, new Employee(4, "pamela","anderson"));
    }

    public ResponseEntity<?> all() {
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("author", "onlyankur@gmail.com");
        responseHeader.set("Access-Control-Expose-Headers", "*");
        return new ResponseEntity<EmployeeListAllResponse>(new EmployeeListAllResponse(db.values()), responseHeader, HttpStatus.OK);
    }

}
