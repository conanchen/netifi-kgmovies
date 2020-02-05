package io.github.kobylynskyi.bikeshop.graphql.resolvers;

import static java.util.stream.Collectors.toList;

import java.util.Collection;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.kobylynskyi.bikeshop.graphql.api.Query;
import io.github.kobylynskyi.bikeshop.graphql.mappers.BikeMapper;
import io.github.kobylynskyi.bikeshop.graphql.model.BikeTO;
import io.github.kobylynskyi.bikeshop.graphql.model.BikeTypeTO;
import io.github.kobylynskyi.bikeshop.model.BikeType;
import io.github.kobylynskyi.bikeshop.service.BikeService;

@Service
public class QueriesResolver implements Query, GraphQLQueryResolver {

    @Autowired
    private BikeService service;
    @Autowired
    private BikeMapper mapper;

    @Override
    public Collection<BikeTO> bikes() {
        return service.findAll().stream()
                .map(mapper::map)
                .collect(toList());
    }

    @Override
    public Collection<BikeTO> bikesByType(BikeTypeTO bikeTypeTO) {
        BikeType bikeType = mapper.mapInputType(bikeTypeTO);
        return service.findByType(bikeType).stream()
                .map(mapper::map)
                .collect(toList());
    }
}
