package com.student.demo.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.demo.management.entity.StudentEntity;
import com.student.demo.management.repository.StudentRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		StudentEntity student1=new StudentEntity(1,"yogesh","kannah","kanniyappanyogesh@gmail.com","Gingee");
//		studentRepository.save(student1);
//		StudentEntity student2=new StudentEntity(2,"sasi","rekha","sasi@gmail.com","vallam");
//		studentRepository.save(student2);
		
		
		
	}

}
