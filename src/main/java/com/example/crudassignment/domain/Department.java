package com.example.crudassignment.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Boolean active;
}
