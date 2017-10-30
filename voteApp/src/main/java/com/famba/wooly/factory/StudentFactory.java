package com.famba.wooly.factory;

import com.famba.wooly.domain.Student;
import com.famba.wooly.utility.KeyGenerator;

public class StudentFactory {
    public static Student buildStudent(String id, String name, String stud_no, String surname, String email, String password){
        Student student = new Student.Builder()
                .id(id)
                .stud_no(stud_no)
                .name(name)
                .surname(surname)
                .email(email)
                .password(password)
                .build();
        return student;
    }
}
