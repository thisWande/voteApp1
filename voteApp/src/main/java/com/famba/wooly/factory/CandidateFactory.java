package com.famba.wooly.factory;

import com.famba.wooly.domain.Candidate;
import com.famba.wooly.utility.KeyGenerator;

/**
 * Created by 213330482 on 9/7/2017.
 */
public class CandidateFactory {
    public static Candidate getCandidate(String name, String surname, String category, String party_name, String cat_id) {
        Candidate candidate = new Candidate.Builder()
            .candidate_id(KeyGenerator.getEntityId())
            .name(name)
            .surname(surname)
            .category(category)
            .party_name(party_name)
            .cat_id(cat_id)
            .build();
    return candidate;
    }
}