package io.github.kobylynskyi.bikeshop.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.kobylynskyi.bikeshop.graphql.api.Mutation;
import io.github.kobylynskyi.bikeshop.graphql.mappers.BikeMapper;
import io.github.kobylynskyi.bikeshop.graphql.model.BikeInputTO;
import io.github.kobylynskyi.bikeshop.graphql.model.BikeTO;
import io.github.kobylynskyi.bikeshop.model.Bike;
import io.github.kobylynskyi.bikeshop.service.BikeService;

@Service
public class MutationsResolver implements Mutation, GraphQLMutationResolver {

    @Autowired
    private BikeService service;
    @Autowired
    private BikeMapper mapper;

    @Override
    public BikeTO newBike(BikeInputTO bikeInputTO) {
        Bike savedBike = service.create(mapper.mapInput(bikeInputTO));
        return mapper.map(savedBike);
    }

}
