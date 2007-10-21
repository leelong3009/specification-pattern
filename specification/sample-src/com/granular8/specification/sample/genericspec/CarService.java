package com.granular8.specification.sample.genericspec;

import com.granular8.specification.genericspec.Specification;
import com.granular8.specification.sample.domain.Car;

import java.util.Collection;

public interface CarService {
  void setRepository(CarRepository repository);

  Collection<Car> findCandidateCars();

  Collection<Car> findCandidateCars(Specification<Car> car);
}