package com.student.demo.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.demo.management.entity.StudentEntity;
import com.student.demo.management.repository.StudentRepository;
import com.student.demo.management.service.StudentService;

import org.springframework.ui.Model;

@Controller
public class StudentController {
	
//	@Autowired
	StudentService studentService;
	
	
//	when i try to create the default constructor it might lead to 
//	NullPointerException 
	
//	public StudentController() {
//		// TODO Auto-generated constructor stub
//	}
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
//	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		StudentEntity student=new StudentEntity();
		model.addAttribute("student",student);
		return "addStudent";
	}
	
	@PostMapping("/students")
	public String Savestudent(@ModelAttribute("student") StudentEntity student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String edit(@PathVariable Integer id,Model model) {
		model.addAttribute("student",studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/student/{id}")
	public String updateStudent(@PathVariable Integer id,@ModelAttribute("student") StudentEntity studentEntity,
			Model model) {
		StudentEntity existingStudent=studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirst_name(studentEntity.getFirst_name());
		existingStudent.setLast_name(studentEntity.getLast_name());
		existingStudent.setEmail(studentEntity.getEmail());
		existingStudent.setAddress(studentEntity.getAddress());
		studentService.updateStudent(existingStudent);
		return "/redirect:/students";
	}
	
}
