package com.jsoja.snakecharmer.repository;

import com.jsoja.snakecharmer.domain.WeightDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface WeightRepository extends CrudRepository<WeightDO, Long> {

    public WeightDO getByWeightId(long id);
}
