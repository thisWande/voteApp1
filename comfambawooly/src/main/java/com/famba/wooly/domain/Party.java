package com.famba.wooly.domain;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by 213330482 on 8/8/2017.
 */

@Entity
public class Party {

    @Id
    private String party_id;
    private String party_name;

    private Party() {
    }

    public String getParty_id() {
        return party_id;
    }

    public String getParty_name() {
        return party_name;
    }

    public Party(Builder builder){
        this.party_id = builder.party_id;
        this.party_name = builder.party_name;
    }

    public static class Builder{
        private String party_id;
        private String party_name;

        public Builder party_id(String value){
            this.party_id = value;
            return this;
        }

        public Builder party_name(String value){
            this.party_name = value;
            return this;
        }

        public Party build(){
            return new Party(this);
        }
    }

    @Override
    public String toString() {
        return "Party{" +
                "party_id='" + party_id + '\'' +
                ", party_name='" + party_name + '\'' +
                '}';
    }
}
