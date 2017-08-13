package voteApp.repository;

import voteApp.domain.Student;

public interface StudentRepository {
    Student create(Student person);

    Student read(String id);

    Student update(Student person);

    void delete(String id);
}
