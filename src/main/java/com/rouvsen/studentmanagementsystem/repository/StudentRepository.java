package com.rouvsen.studentmanagementsystem.repository;

import com.rouvsen.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository
        extends JpaRepository<Student,Long> {
}
