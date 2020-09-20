package com.ankur.zuul.controller;



import com.ankur.zuul.domain.EmployeeListAllRequest;
import com.ankur.zuul.domain.EmployeeListAllResponse;
import com.ankur.zuul.domain.ServiceErrorResponse;
import com.ankur.zuul.service.EmployeeService;
import io.swagger.annotations.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/services/employee")
@Api(value = "/services/employee", tags = ("Employee Management"))
@CrossOrigin(allowedHeaders = "*", maxAge = 3600)
public class EmployeeController {

    private static final String CLIENT_ID = "client-id";
    private EmployeeService employeeService;

    private static final String VALID_USERNAME = "ankur";
    private static final String VALID_PASSWORD = "ankur";



    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @RequestMapping(value = "allC", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ApiOperation(value = "allC", notes = "Fetch all employees", nickname = "all")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Missing / invalid parameter", response = ServiceErrorResponse.class),
            @ApiResponse(code = 200, message = "Success", response = EmployeeListAllResponse.class)})
    public ResponseEntity<?> allWithCredentials(@RequestHeader(value = CLIENT_ID) String clientId,
                                                @Valid @RequestBody EmployeeListAllRequest request) {
        System.out.println("Username provided in request: " + request.getUsername());
        System.out.println("Password provided in request: " + request.getPassword());
            return employeeService.all();
    }

    @RequestMapping(value = "all", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "all", notes = "Fetch all employees", nickname = "all")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Missing / invalid parameter", response = ServiceErrorResponse.class),
            @ApiResponse(code = 200, message = "Success", response = EmployeeListAllResponse.class)})
    public ResponseEntity<?> all() {
        return employeeService.all();
    }




}

