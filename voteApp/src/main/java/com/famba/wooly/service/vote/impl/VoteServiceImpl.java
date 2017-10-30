package com.famba.wooly.service.vote.impl;

import com.famba.wooly.domain.Vote;
import com.famba.wooly.repository.VoteRepository;
import com.famba.wooly.service.vote.VoteService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 213330482 on 9/7/2017.
 */
public class VoteServiceImpl implements VoteService {

    @Autowired
    VoteRepository voteRepository;

    @Override
    public Vote save(Vote entity) {
        return voteRepository.save(entity);
    }

    @Override
    public Vote findbyId(String s) {
        return voteRepository.findOne(s);
    }

    @Override
    public Vote update(Vote entity) {
        return voteRepository.save(entity);
    }

    @Override
    public void delete(Vote entity) {
        voteRepository.delete(entity);
    }
}
