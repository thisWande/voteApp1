package voteApp.service;

import voteApp.domain.Student;

public interface StudentService {
    Student create(Student person);
    Student read(String id);
    Student update(Student person);
    void delete (String id);
}
