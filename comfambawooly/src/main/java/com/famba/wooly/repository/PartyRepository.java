package com.famba.wooly.repository;

import com.famba.wooly.domain.Party;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 213330482 on 9/7/2017.
 */
public interface PartyRepository extends CrudRepository<Party, String> {
}