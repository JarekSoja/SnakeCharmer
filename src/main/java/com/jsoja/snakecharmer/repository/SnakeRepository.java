package com.jsoja.snakecharmer.repository;

import com.jsoja.snakecharmer.domain.SnakeDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface SnakeRepository extends CrudRepository<SnakeDO, Long> {

}
