package com.famba.wooly.factory;

import com.famba.wooly.domain.Party;

/**
 * Created by 213330482 on 9/7/2017.
 */
public class PartyFactory {
    public static Party buildParty(String party_id, String party_name){
        Party party = new Party.Builder()
                .party_id(party_id)
                .party_name(party_name)
                .build();
        return party;
    }
}
