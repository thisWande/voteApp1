package com.famba.wooly.domain;
/**
 * Created by 213330482 on 8/8/2017.
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Vote {

    @Id
    private String vote_code;
    private String stud_no;
    private String candidate_id;
    private Date vote_date;

    private Vote(){}

    public String getVote_code() {
        return vote_code;
    }

    public String getStud_no() {
        return stud_no;
    }

    public String getCandidate_id() {
        return candidate_id;
    }

    public Date getVote_date() {
        return vote_date;
    }

    public Vote(Builder builder){
        this.vote_code = builder.vote_code;
        this.stud_no = builder.stud_no;
        this.candidate_id = builder.candidate_id;
        this.vote_date = builder.vote_date;
    }

    public static class Builder {
        private String vote_code;
        private String stud_no;
        private String candidate_id;
        private Date vote_date;

        public Builder vote_code(String value){
            this.vote_code = value;
            return this;
        }

        public Builder stud_no(String value) {
            this.stud_no = value;
            return this;
        }

        public Builder candidate_id(String value) {
            this.candidate_id = value;
            return this;
        }

        public Builder vote_date(Date value) {
            this.vote_date = value;
            return this;
        }

        public Vote build(){
            return new Vote(this);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vote vote = (Vote) o;

        if (!vote_code.equals(vote.vote_code)) return false;
        if (!stud_no.equals(vote.stud_no)) return false;
        return candidate_id.equals(vote.candidate_id);
    }

    @Override
    public int hashCode() {
        return vote_code.hashCode();
    }

    @Override
    public String toString() {
        return "Vote{" +
                "vote_code='" + vote_code + '\'' +
                ", stud_no='" + stud_no + '\'' +
                ", candidate_id='" + candidate_id + '\'' +
                ", vote_date=" + vote_date +
                '}';
    }
}
