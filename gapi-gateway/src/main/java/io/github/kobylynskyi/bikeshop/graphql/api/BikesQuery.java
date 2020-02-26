package io.github.kobylynskyi.bikeshop.graphql.api;

import io.github.kobylynskyi.bikeshop.graphql.model.BikeTO;

import java.util.Collection;

public interface BikesQuery {

    Collection<BikeTO> bikes() throws Exception;

}