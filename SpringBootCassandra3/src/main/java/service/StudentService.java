package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.BookRepository;

@Service
public class StudentService {
	
	@Autowired
	BookRepository bookRepository;

}
