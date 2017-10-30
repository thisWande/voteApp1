package com.famba.wooly.repository;

import com.famba.wooly.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {

}
