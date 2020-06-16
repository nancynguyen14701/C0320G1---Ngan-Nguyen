package com.codygym.demothymeleaf.services.impl;

import com.codygym.demothymeleaf.models.Student;
import com.codygym.demothymeleaf.repository.StudentRepository;
import com.codygym.demothymeleaf.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.getAll();
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.getById(id);
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
}
