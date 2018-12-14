package com.jsoja.snakecharmer.repository;

import com.jsoja.snakecharmer.domain.ShedDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface ShedRepository extends CrudRepository<ShedDO, Long> {


}
