package app.service;

import java.util.List;

public interface IGenericService<T> {
    List<T> findAll();
    T save(T obj);
    T findBydId(Long id);
    void deleteById(Long id);
    void delete(T obj);

    long count();
}
