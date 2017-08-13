package voteApp.factory;

import voteApp.domain.Vote;

import java.util.Date;
import java.util.Map;

public class VoteFactory {

    public static Vote getVote(Map<String, String > values, Date date){
        Vote vote = new Vote.Builder()
                .vote_code(values.get("001"))
                .stud_no(values.get("213330482"))
                .candidate_id(values.get("047"))
                .vote_date(new Date(17,8,2017))
                .build();
        return vote;

    }
}
