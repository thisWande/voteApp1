package voteApp.repository.Impl;

import voteApp.domain.Vote;
import voteApp.repository.VoteRepository;

import java.util.HashMap;
import java.util.Map;

public class VoteRepositoryImpl implements VoteRepository{
    private static VoteRepositoryImpl repository = null;

    private Map<String,Vote> voteTable;

    private VoteRepositoryImpl(){
        voteTable = new HashMap<String, Vote>();
    }

    public static VoteRepositoryImpl getInstance(){
        if(repository == null)
            repository = new VoteRepositoryImpl();
        return repository;
    }

    public Vote create(Vote vote){
        voteTable.put(vote.getVote_code(),vote);
        Vote savedVote = voteTable.get(vote.getVote_code());
        return savedVote;
    }

    public Vote read(String id){
        Vote vote = voteTable.get(id);
        return vote;
    }

    public Vote update(Vote vote){
        voteTable.put(vote.getVote_code(), vote);
        Vote savedVote = voteTable.get(vote.getVote_code());
        return savedVote;
    }

    public void delete(String id) {
        voteTable.remove(id);
    }
}
