package voteApp.factory;

import voteApp.domain.Candidate;

import java.util.Map;

public class CandidateFactory {
    public static Candidate getCandidate(Map<String, String> values){
        Candidate candidate = new Candidate.Builder()
                .candidate_id(values.get("001"))
                .name(values.get("Julius"))
                .surname(values.get("Malema"))
                .category(values.get("National Presidency"))
                .party_name(values.get("EFF"))
                .cat_id(values.get("047"))
                .build();
        return candidate;
    }
}
