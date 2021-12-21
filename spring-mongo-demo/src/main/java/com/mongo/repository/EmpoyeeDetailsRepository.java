package com.mongo.repository;

import com.mongo.entity.EmployeeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpoyeeDetailsRepository  extends MongoRepository<EmployeeEntity,String> {
}
