package com.codygym.demothymeleaf.services;

import com.codygym.demothymeleaf.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student getStudentById(int id);
    void deleteStudentById(int id);
    void saveStudent(Student student);
}
