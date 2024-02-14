package com.student.demo.management.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.student.demo.management.entity.StudentEntity;

@Service
public interface StudentService {
	
	public List<StudentEntity> getAllStudents();
	
	public StudentEntity saveStudent(StudentEntity student);

	StudentEntity getStudentById(Integer id);
	
	StudentEntity updateStudent(StudentEntity studentEntity);
}
