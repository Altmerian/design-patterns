package com.pshakhlovich.solid.interfsegreg.service;

import com.pshakhlovich.solid.interfsegreg.entity.Entity;

//common interface to be implemented by all persistence services.
public interface PersistenceService<T extends Entity> {

    void save(T entity);

    void delete(T entity);

    T findById(Long id);

}
