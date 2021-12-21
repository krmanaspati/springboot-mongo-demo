package com.mongo.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class EmployeeEntity {
    private String id;
    private String name;
    private String mobileNumber;
}
