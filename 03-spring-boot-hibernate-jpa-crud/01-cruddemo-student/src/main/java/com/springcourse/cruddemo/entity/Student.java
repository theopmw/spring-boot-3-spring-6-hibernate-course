package com.springcourse.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

//    define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;


//    define constructors

//    define getters/setters

//    define toString() method
}
