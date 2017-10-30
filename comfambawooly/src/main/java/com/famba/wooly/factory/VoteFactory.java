package com.famba.wooly.factory;

import com.famba.wooly.domain.Vote;

import java.util.Date;

/**
 * Created by 213330482 on 9/7/2017.
 */
public class VoteFactory {
    public static Vote buildVote(String vote_code, String stud_no, String candidate_id, Date vote_date){
        Vote vote = new Vote.Builder()
                .vote_code(vote_code)
                .stud_no(stud_no)
                .candidate_id(candidate_id)
                .vote_date(vote_date)
                .build();
        return vote;
    }

}
