package io.github.kobylynskyi.bikeshop.graphql.api;

import java.util.*;
import io.github.kobylynskyi.bikeshop.graphql.model.*;

public interface Query {

    Collection<BikeTO> bikes() throws Exception;

    Collection<BikeTO> bikesByType(BikeTypeTO type) throws Exception;

}