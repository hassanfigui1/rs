package app.service;

import app.model.BaseEntity;
import app.repository.IGenericRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericService<T extends BaseEntity> implements IGenericService<T> {
    private final IGenericRepository<T> repository;

    public GenericService(IGenericRepository<T> repository) {
        this.repository = repository;
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T save(T obj) {
        return repository.save(obj);
    }

    @Override
    public T findBydId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void delete(T obj) {
        repository.delete(obj);
    }

    @Override
    public long count() {
        return repository.count();
    }
}
