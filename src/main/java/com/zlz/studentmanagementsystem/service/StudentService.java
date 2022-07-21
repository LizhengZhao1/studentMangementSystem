package com.zlz.studentmanagementsystem.service;

import com.zlz.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    int deleteStudentById(Long id);


}
