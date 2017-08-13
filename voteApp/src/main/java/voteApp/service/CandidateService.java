package voteApp.service;

import voteApp.domain.Candidate;

public interface CandidateService {
    Candidate create(Candidate candidate);
    Candidate read(String id);
    Candidate update(Candidate candidate);
    void delete(String id);
}
