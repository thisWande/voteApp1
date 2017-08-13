package voteApp.factory;

import voteApp.domain.Student;

import java.util.Map;

public class StudentFactory {
    public static Student getStudent(Map<String, String> values){
        Student student = new Student.Builder()
                .id(values.get("001"))
                .stud_no(values.get("213330482"))
                .name(values.get("Mawande"))
                .surname(values.get("Matanzima"))
                .email(values.get("213330482@mycput.ac.za"))
                .password(values.get("djfhkjehf"))
                .build();
        return student;
    }
}
