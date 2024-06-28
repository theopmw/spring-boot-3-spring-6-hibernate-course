package com.springcourse.cruddemo.dao;

import com.springcourse.cruddemo.entity.Student;

public interface StudentDAO {

//    Define save/create method
    void save(Student theStudent);

//    Define the read method
    Student findById(Integer id);

}
