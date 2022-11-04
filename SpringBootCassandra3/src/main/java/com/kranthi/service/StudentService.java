package com.kranthi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kranthi.model.Student;
import com.kranthi.repository.BookRepository;

@Service
public class StudentService {
	@Autowired
	BookRepository bookRepository;
	
	
	public  List<Student> getAll(){
		return bookRepository.findAll();
	}
	
	public  Student save(Student st){
		return bookRepository.save(st);
	}

}
