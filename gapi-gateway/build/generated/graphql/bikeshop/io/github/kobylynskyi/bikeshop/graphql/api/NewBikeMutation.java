package io.github.kobylynskyi.bikeshop.graphql.api;

import io.github.kobylynskyi.bikeshop.graphql.model.BikeInputTO;
import io.github.kobylynskyi.bikeshop.graphql.model.BikeTO;

public interface NewBikeMutation {

    BikeTO newBike(BikeInputTO bike) throws Exception;

}