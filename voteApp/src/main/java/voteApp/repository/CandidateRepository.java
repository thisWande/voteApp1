package voteApp.repository;

import voteApp.domain.Candidate;

public interface CandidateRepository {
    Candidate create(Candidate candidate);

    Candidate read(String id);

    Candidate update(Candidate candidate);

    void delete(String id);
}
