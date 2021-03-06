package com.granular8.specification.sample.spec;

import com.granular8.specification.sample.domain.Car;

import java.util.Collection;

/**
 * Service for dealing with cars.
 */
public interface CarService {

  /**
   * Set a repository to use for car lookups.
   *
   * @param repository Car repository to use
   */
  void setRepository(CarRepository repository);

  /**
   * Find candidate cars. A candidate car is a car that is
   * of the color red and is a convertible,
   * <i>or</i>
   * is red and has an owner that lives in an approved region and is less than five years old.
   *
   * @return Cars in the configured repository matching the description above.
   */
  Collection<Car> findCandidateCars();
}