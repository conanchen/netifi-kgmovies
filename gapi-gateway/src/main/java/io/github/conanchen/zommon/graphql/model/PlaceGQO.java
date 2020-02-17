package io.github.conanchen.zommon.graphql.model;

import java.util.Collection;
import io.github.conanchen.place.graphql.model.GeoCoordinatesGQO;

public interface PlaceGQO {

    String getAddress();

    PlaceGQO getContainedInPlace();

    Collection<PlaceGQO> getContainsPlaces();

    GeoCoordinatesGQO getGeo();

}