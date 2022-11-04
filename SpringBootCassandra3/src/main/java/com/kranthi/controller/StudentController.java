package com.kranthi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kranthi.model.Student;
import com.kranthi.repository.BookRepository;
import com.kranthi.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	BookRepository  bookRepository;
	
	@Autowired
	StudentService studentService;
	
	
	@PostConstruct
	public void saveStudents() {
		List<Student> sts=new ArrayList<Student>();
		sts.add(new Student(1,"raju","hyd"));
		sts.add(new Student(2,"kar","blr"));
		sts.add(new Student(3,"bar","cnr"));
		sts.add(new Student(4,"car","adr"));
		List<Student> savst=bookRepository.saveAll(sts);
		System.out.println("saved"+savst);
	}
	
	@GetMapping("/home")
	public String welcome() {
		System.out.println("Hello");
		return "hello";
		
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Student std) {
		studentService.save(std);
		
	}
	@GetMapping("/getall")
	public List<Student> getAll() {
		return studentService.getAll();
		
	}

}
