package com.famba.wooly.repository;

import com.famba.wooly.domain.Vote;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 213330482 on 9/7/2017.
 */
public interface VoteRepository extends CrudRepository<Vote, String> {
}