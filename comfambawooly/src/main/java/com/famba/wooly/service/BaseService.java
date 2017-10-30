package com.famba.wooly.service;

public interface BaseService<E, ID> {
    E save(E entity);
    E findbyId(ID id);
    E update(E entity);
    void delete(E id);

}
