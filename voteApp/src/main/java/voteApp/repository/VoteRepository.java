package voteApp.repository;

import voteApp.domain.Vote;

public interface VoteRepository {
    Vote create(Vote vote);

    Vote read(String id);

    Vote update(Vote vote);

    void delete(String id);
}
