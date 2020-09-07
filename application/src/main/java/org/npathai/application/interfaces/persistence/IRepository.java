package org.npathai.application.interfaces.persistence;

import java.util.List;

public interface IRepository<T> {
    List<T> getAll();

    T getById(long id);

    void save(T entity);

    void remove(T entity);
}
