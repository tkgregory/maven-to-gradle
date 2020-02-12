package com.tomgregory.maventogradle.repository;

import com.tomgregory.maventogradle.entity.Vegetable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VegetableRepository extends CrudRepository<Vegetable, Integer> {
}
