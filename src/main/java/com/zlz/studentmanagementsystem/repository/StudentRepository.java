package com.zlz.studentmanagementsystem.repository;

import com.zlz.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
