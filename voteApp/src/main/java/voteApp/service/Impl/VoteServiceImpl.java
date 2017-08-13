package voteApp.service.Impl;

import voteApp.domain.Vote;
import voteApp.repository.Impl.VoteRepositoryImpl;
import voteApp.repository.VoteRepository;
import voteApp.service.VoteService;

public class VoteServiceImpl implements VoteService {

    private static VoteServiceImpl service = null;
    VoteRepository repository = VoteRepositoryImpl.getInstance();

    public static VoteServiceImpl getInstance(){
        if(service == null)
            service = new VoteServiceImpl();
        return service;
    }

    public Vote create(Vote vote){
        return repository.create(vote);
    }

    public Vote read(String id){
        return repository.read(id);
    }

    public Vote update(Vote vote){
        return repository.update(vote);
    }

    public void delete(String id){
        repository.delete(id);
    }
}
