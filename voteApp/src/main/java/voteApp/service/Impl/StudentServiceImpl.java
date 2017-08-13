package voteApp.service.Impl;

import voteApp.domain.Student;
import voteApp.repository.Impl.StudentRepositoryImpl;
import voteApp.repository.StudentRepository;
import voteApp.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private static StudentServiceImpl service = null;

    StudentRepository repository = StudentRepositoryImpl.getInstance();
    public static StudentServiceImpl getInstance(){
        if(service == null)
            service = new StudentServiceImpl();
        return service;
    }

    public Student create(Student student){
        return repository.create(student);
    }

    public Student read(String id){
        return repository.read(id);
    }

    public Student update(Student student){
        return repository.update(student);
    }

    public void delete(String id){
        repository.delete(id);
    }
}
