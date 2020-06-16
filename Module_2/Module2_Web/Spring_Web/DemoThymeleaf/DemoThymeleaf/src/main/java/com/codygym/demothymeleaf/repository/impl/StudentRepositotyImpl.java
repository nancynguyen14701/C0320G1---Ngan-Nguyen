package com.codygym.demothymeleaf.repository.impl;

import com.codygym.demothymeleaf.models.Student;
import com.codygym.demothymeleaf.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepositotyImpl implements StudentRepository {
    private static Map<Integer, Student> listStudent;

    static {
        listStudent = new HashMap<>();
        listStudent.put(1, new Student(1, "Cuong","cuong@gmail.com"));
        listStudent.put(2, new Student(2, "Tu","tu@gmail.com"));
        listStudent.put(3, new Student(3, "Long","long@gmail.com"));
        listStudent.put(4, new Student(4, "Hau","hau@gmail.com"));
    }
    @Override
    public List<Student> getAll() {
        return new ArrayList<>(listStudent.values());
    }

    @Override
    public Student getById(int id) {
        return listStudent.get(id);
    }

    @Override
    public void deleteById(int id) {
        listStudent.remove(id);
    }

    @Override
    public void save(Student student) {
        listStudent.put(student.getId(), student);
    }
}
