package io.github.kobylynskyi.bikeshop.graphql.api;

import java.util.*;
import io.github.kobylynskyi.bikeshop.graphql.model.*;

public interface BikesByTypeQuery {

    Collection<BikeTO> bikesByType(BikeTypeTO type) throws Exception;

}