package com.famba.wooly.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by 213330482 on 8/8/2017.
 */

@Entity
public class Category {
    @Id
    private String cat_id;
    private String candidate_id, cat_name, candidate_name, cat_description;

    private Category() {
    }

    public String getCandidate_id() {
        return candidate_id;
    }

    public String getCandidate_name() {
        return candidate_name;
    }

    public String getCat_id() {
        return cat_id;
    }


    public String getCat_name() {
        return cat_name;
    }


    public String getCat_description() {
        return cat_description;
    }

    public Category (Builder builder){
        this.cat_id = builder.cat_id;
        this.candidate_id = builder.candidate_id;
        this.cat_name = builder.cat_name;
        this.candidate_name = builder.candidate_name;
        this.cat_description = builder.cat_description;
    }

    public static class Builder{
        private String cat_id;
        private String candidate_id;
        private String cat_name;
        private String candidate_name;
        private String cat_description;

        public Builder cat_id(String value){
            this.cat_id = value;
            return this;
        }

        public Builder candidate_id(String value){
            this.candidate_id = value;
            return this;
        }

        public Builder cat_name(String value){
            this.cat_name = value;
            return this;
        }

        public Builder candidate_name(String value){
            this.candidate_name = value;
            return this;
        }

        public Builder cat_description(String value){
            this.cat_description = value;
            return this;
        }

        public Category build(){
            return new Category(this);
        }
    }

    @Override
    public String toString() {
        return "Category{" +
                "cat_id='" + cat_id + '\'' +
                ", candidate_id='" + candidate_id + '\'' +
                ", cat_name='" + cat_name + '\'' +
                ", candidate_name='" + candidate_name + '\'' +
                ", cat_description='" + cat_description + '\'' +
                '}';
    }
}
