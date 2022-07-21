package com.zlz.studentmanagementsystem.service.impl;

import com.zlz.studentmanagementsystem.entity.Student;
import com.zlz.studentmanagementsystem.repository.StudentRepository;
import com.zlz.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public int deleteStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if(student == null) return -1;
        studentRepository.deleteById(id);
        return 1;
    }
}
