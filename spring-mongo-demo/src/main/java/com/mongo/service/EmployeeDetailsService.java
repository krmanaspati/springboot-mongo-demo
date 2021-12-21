package com.mongo.service;

import com.mongo.entity.EmployeeEntity;
import com.mongo.repository.EmpoyeeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDetailsService {

    @Autowired
    EmpoyeeDetailsRepository empoyeeDetailsRepository;

    public void saveEmp(EmployeeEntity emp){
        empoyeeDetailsRepository.save(emp);
    }

}
