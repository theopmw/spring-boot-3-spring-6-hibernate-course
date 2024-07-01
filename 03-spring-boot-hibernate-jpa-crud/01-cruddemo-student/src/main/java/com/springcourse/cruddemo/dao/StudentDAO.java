package com.springcourse.cruddemo.dao;

import com.springcourse.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

//    Define save/create method
    void save(Student theStudent);

//    Define the read method
    Student findById(Integer id);

    List<Student> findAll();

}
