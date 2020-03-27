package io.github.kobylynskyi.bikeshop.repository;

import io.github.kobylynskyi.bikeshop.model.Bike;
import io.github.kobylynskyi.bikeshop.model.BikeType;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class BikeRepositoryImpl implements BikeRepository{

    public Collection<Bike> findByType(BikeType type){
        return Collections.EMPTY_LIST;
    }

    public Collection<Bike> findAll(){
        return  Collections.emptyList();
    }

    public Bike save(Bike bikeInput){
        return new Bike();
    }
}
