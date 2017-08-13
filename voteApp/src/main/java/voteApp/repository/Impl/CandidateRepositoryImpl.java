package voteApp.repository.Impl;

import voteApp.domain.Candidate;
import voteApp.repository.CandidateRepository;

import java.util.HashMap;
import java.util.Map;

public class CandidateRepositoryImpl implements CandidateRepository {

    private static CandidateRepositoryImpl repository = null;

    private Map<String, Candidate> candidateTable;

    private CandidateRepositoryImpl(){
        candidateTable = new HashMap<String, Candidate>();
    }

    public static CandidateRepositoryImpl getInstance(){
        if(repository == null)
            repository = new CandidateRepositoryImpl();
        return repository;
    }

    public Candidate create(Candidate candidate) {
        candidateTable.put(candidate.getCandidate_id(), candidate);
        Candidate savedCandidate = candidateTable.get(candidate.getCandidate_id());
        return savedCandidate;
    }

    public Candidate read(String id) {
        Candidate candidate = candidateTable.get(id);
        return candidate;
    }

    public Candidate update(Candidate candidate) {
        candidateTable.put(candidate.getCandidate_id(),candidate);
        Candidate savedCandidate = candidateTable.get(candidate.getCandidate_id());
        return savedCandidate;
    }

    public void delete(String id) {
        candidateTable.remove(id);
    }
}
