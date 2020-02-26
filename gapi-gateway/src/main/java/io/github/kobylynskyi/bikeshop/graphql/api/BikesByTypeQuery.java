package io.github.kobylynskyi.bikeshop.graphql.api;

import io.github.kobylynskyi.bikeshop.graphql.model.BikeTO;
import io.github.kobylynskyi.bikeshop.graphql.model.BikeTypeTO;

import java.util.Collection;

public interface BikesByTypeQuery {

    Collection<BikeTO> bikesByType(BikeTypeTO type) throws Exception;

}