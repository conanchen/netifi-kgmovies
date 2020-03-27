package io.github.kobylynskyi.bikeshop.repository;

import io.github.kobylynskyi.bikeshop.model.Bike;
import io.github.kobylynskyi.bikeshop.model.BikeType;

import java.util.Collection;

public interface BikeRepository {

    Collection<Bike> findByType(BikeType type);

    Collection<Bike> findAll();

    Bike save(Bike bikeInput);
}
