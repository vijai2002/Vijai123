package com.student.demo.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.management.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
