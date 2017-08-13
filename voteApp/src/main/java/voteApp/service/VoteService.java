package voteApp.service;

import voteApp.domain.Vote;

public interface VoteService {
    Vote create(Vote vote);
    Vote read(String id);
    Vote update(Vote vote);
    void delete (String id);
}
