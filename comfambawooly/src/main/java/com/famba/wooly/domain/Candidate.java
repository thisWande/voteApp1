package com.famba.wooly.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by 213330482 on 8/8/2017.
 */
@Entity
public class Candidate {

    @Id
    private String candidate_id;
    private String name, surname, party_name, category, cat_id;

    private Candidate() {
    }

    public String getCandidate_id() {
        return candidate_id;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getParty_name() {
        return party_name;
    }


    public String getCategory() {
        return category;
    }


    public String getCat_id() {
        return cat_id;
    }

    public Candidate(Builder builder){
        this.candidate_id = builder.candidate_id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.party_name = builder.party_name;
        this.category = builder.category;
        this.cat_id = builder.cat_id;
    }
    public static class Builder{
        private String candidate_id;
        private String name;
        private String surname;
        private String party_name;
        private String category;
        private String cat_id;

        public Builder candidate_id(String value){
            this.candidate_id = value;
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

        public Builder party_name(String value){
            this.party_name = value;
            return this;
        }

        public Builder category(String value){
            this.category = value;
            return this;
        }

        public Builder cat_id(String value){
            this. cat_id = value;
            return this;
        }

        public Candidate build(){
            return new Candidate(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candidate candidate = (Candidate) o;

        return candidate_id.equals(candidate.candidate_id);
    }

    @Override
    public int hashCode() {
        return candidate_id.hashCode();
    }

    @Override
    public String toString() {
        return "CandidateRepository{" +
                "candidate_id='" + candidate_id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", party_name='" + party_name + '\'' +
                ", category='" + category + '\'' +
                ", cat_id='" + cat_id + '\'' +
                '}';
    }
}