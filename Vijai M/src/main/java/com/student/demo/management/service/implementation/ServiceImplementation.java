package com.student.demo.management.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.management.entity.StudentEntity;
import com.student.demo.management.repository.StudentRepository;
import com.student.demo.management.service.StudentService;

@Service
public class ServiceImplementation implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
//	we actually dont need to annotate the @Autowired beacuse we need to create 
//	only one object for studentRepository reference ...
	
	public ServiceImplementation(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
//	
	@Override
	public List<StudentEntity> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	@Override
	public StudentEntity saveStudent(StudentEntity student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	@Override
	public StudentEntity getStudentById(Integer id) {
		return studentRepository.findById(id).get();
		
	}
	@Override
	public StudentEntity updateStudent(StudentEntity studentEntity) {
		return studentRepository.save(studentEntity);
	}


}
