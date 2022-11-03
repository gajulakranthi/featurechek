package com.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Student;


public interface BookRepository extends CassandraRepository<Student, Integer>{

}
