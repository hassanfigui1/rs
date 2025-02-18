package app.repository;

import app.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenericRepository<T extends BaseEntity> extends JpaRepository<T, Long> {

}
