package io.github.conanchen.place.graphql.model;

import java.util.*;
import io.github.conanchen.place.graphql.api.*;

public interface PlaceGQO {

    String getAddress();

    PlaceGQO getContainedInPlace();

    Collection<PlaceGQO> getContainsPlaces();

    GeoCoordinatesGQO getGeo();

}