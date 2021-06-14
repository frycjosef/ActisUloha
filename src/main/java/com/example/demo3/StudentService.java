package com.example.demo3;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
     *
     * @return all students from database
     */
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
