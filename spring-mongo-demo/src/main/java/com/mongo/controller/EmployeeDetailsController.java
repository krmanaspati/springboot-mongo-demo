package com.mongo.controller;

import com.mongo.entity.EmployeeEntity;
import com.mongo.service.EmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/v1/api")
public class EmployeeDetailsController {

    @Autowired
    EmployeeDetailsService employeeDetailsService;

    @PostMapping(value="/addEmp")
    public void addEmp(@RequestBody EmployeeEntity emp){

        employeeDetailsService.saveEmp(emp);

    }
}
