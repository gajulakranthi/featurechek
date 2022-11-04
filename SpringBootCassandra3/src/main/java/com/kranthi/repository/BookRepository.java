package com.kranthi.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.kranthi.model.Student;

@Repository
public interface BookRepository extends CassandraRepository<Student, Integer>{

}
