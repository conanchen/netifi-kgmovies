package io.github.conanchen.message.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.api.*;

public class PlaceGQO implements NodeGQO{

    private String address;
    private PlaceGQO containedInPlace;
    private Collection<PlaceGQO> containsPlaces;
    private GeoCoordinatesGQO geo;
    @javax.validation.constraints.NotNull
    private String id;

    public PlaceGQO() {
    }

    public PlaceGQO(String address, PlaceGQO containedInPlace, Collection<PlaceGQO> containsPlaces, GeoCoordinatesGQO geo, String id) {
        this.address = address;
        this.containedInPlace = containedInPlace;
        this.containsPlaces = containsPlaces;
        this.geo = geo;
        this.id = id;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public PlaceGQO getContainedInPlace() {
        return containedInPlace;
    }
    public void setContainedInPlace(PlaceGQO containedInPlace) {
        this.containedInPlace = containedInPlace;
    }

    public Collection<PlaceGQO> getContainsPlaces() {
        return containsPlaces;
    }
    public void setContainsPlaces(Collection<PlaceGQO> containsPlaces) {
        this.containsPlaces = containsPlaces;
    }

    public GeoCoordinatesGQO getGeo() {
        return geo;
    }
    public void setGeo(GeoCoordinatesGQO geo) {
        this.geo = geo;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}