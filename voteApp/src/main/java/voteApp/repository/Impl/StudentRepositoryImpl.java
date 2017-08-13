package voteApp.repository.Impl;

import voteApp.domain.Student;
import voteApp.repository.StudentRepository;

import java.util.HashMap;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository {
    private static StudentRepositoryImpl respository = null;

    private Map<String,Student> studentTable;

    private StudentRepositoryImpl() {
        studentTable = new HashMap<String, Student>();
    }

    public static StudentRepositoryImpl getInstance(){
        if(respository==null)
            respository = new StudentRepositoryImpl();
        return respository;
    }

    public Student create(Student student) {
        studentTable.put(student.getId(),student);
        Student savedStudent = studentTable.get(student.getId());
        return savedStudent;
    }

    public Student read(String id) {
        Student student = studentTable.get(id);
        return student;
    }

    public Student update(Student student) {
        studentTable.put(student.getId(),student);
        Student savedStudent = studentTable.get(student.getId());
        return savedStudent;
    }

    public void delete(String id) {
        studentTable.remove(id);

    }
}
