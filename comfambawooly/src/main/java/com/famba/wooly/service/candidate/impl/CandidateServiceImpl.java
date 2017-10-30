package com.famba.wooly.service.candidate.impl;

import com.famba.wooly.domain.Candidate;
import com.famba.wooly.repository.CandidateRepository;
import com.famba.wooly.service.candidate.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 213330482 on 9/7/2017.
 */
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    CandidateRepository candidateRepository;

    @Override
    public Candidate save(Candidate entity) {
        return candidateRepository.save(entity);
    }

    @Override
    public Candidate findbyId(String s) {
        return candidateRepository.findOne(s);
    }


   // @Override
    //public Candidate findbyId(String s) {
     //   return null;
    //}

    @Override
    public Candidate update(Candidate entity) {
        return null;
    }

    @Override
    public void delete(Candidate id) {

    }
}
