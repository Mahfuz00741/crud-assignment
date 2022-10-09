package com.example.crudassignment.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employee")
public class Employee {

    public enum Gender {
        Male,
        Female,
        others;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String dob;
    private Gender gender;
    private String mobile;
    private Long departmentId;

}
