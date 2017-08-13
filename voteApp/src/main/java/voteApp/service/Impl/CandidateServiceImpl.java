package voteApp.service.Impl;

import voteApp.domain.Candidate;
import voteApp.repository.CandidateRepository;
import voteApp.repository.Impl.CandidateRepositoryImpl;
import voteApp.service.CandidateService;

public class CandidateServiceImpl implements CandidateService {

    private static CandidateServiceImpl service =  null;
    CandidateRepository repository = CandidateRepositoryImpl.getInstance();

    public static CandidateServiceImpl getInstance(){
        if(service == null)
            service = new CandidateServiceImpl();
        return service;
    }

    public Candidate create(Candidate candidate){
        return repository.create(candidate);
    }

    public Candidate read(String id){
        return repository.read(id);
    }

    public Candidate update(Candidate candidate){
        return repository.update(candidate);
    }

    public void delete(String id){
        repository.delete(id);
    }
}
