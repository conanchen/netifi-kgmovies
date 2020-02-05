package io.github.kobylynskyi.bikeshop.graphql.api;

import java.util.*;
import io.github.kobylynskyi.bikeshop.graphql.model.*;

public interface BikesQuery {

    Collection<BikeTO> bikes() throws Exception;

}