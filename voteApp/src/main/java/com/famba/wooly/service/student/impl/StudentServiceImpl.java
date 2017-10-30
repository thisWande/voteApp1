package com.famba.wooly.service.student.impl;

import com.famba.wooly.domain.Student;
import com.famba.wooly.repository.StudentRepository;
import com.famba.wooly.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student entity) {
        return studentRepository.save(entity);
    }

    @Override
    public Student findbyId(String s) {
        return studentRepository.findOne(s);
    }

    @Override
    public Student update(Student entity) {
        return studentRepository.save(entity);
    }

    @Override
    public void delete(Student entity) {
        studentRepository.delete(entity);
    }

    public List<Student> getStudent() {
        List<Student> allStudent = new ArrayList<Student>();

        Iterable<Student> student = studentRepository.findAll();
        for (Student stud : student) {
            allStudent.add(stud);
        }
        return allStudent;
    }

    
}
