package com.famba.wooly.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by 213330482 on 8/8/2017.
 */
@Entity
public class Student implements Serializable {

    @Id
    private String id;
    private String stud_no;
    private String name;
    private String surname;
    private String password;
    private String email;

    private Student() {
    }

    public String getId() {
        return id;
    }

    public String getStud_no() {
        return stud_no;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Student(Builder builder){
        this.id = builder.id;
        this.stud_no  = builder.stud_no;
        this.name = builder.name;
        this.surname = builder.surname;
        this.password = builder.password;
        this.email = builder.email;
    }
    public static class Builder{
        private String id;
        private String stud_no;
        private String name;
        private String surname;
        private String password;
        private String email;

        public Builder id(String value){
            this.id = value;
            return this;
        }
        public Builder stud_no(String value){
            this.stud_no = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder surname(String value){
            this.surname = value;
            return this;
        }

        public Builder password(String value){
            this.password = value;
            return this;
        }

        public Builder email(String value){
            this.email = value;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return stud_no.equals(student.stud_no);
    }

    @Override
    public int hashCode() {
        return stud_no.hashCode();
    }

    @Override
    public String toString() {
        return "Student{" +
                "stud_no='" + stud_no + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
