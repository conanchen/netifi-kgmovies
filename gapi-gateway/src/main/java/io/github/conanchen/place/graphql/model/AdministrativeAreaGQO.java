package io.github.conanchen.place.graphql.model;

import java.util.Collection;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.PlaceGQO;

public class AdministrativeAreaGQO implements PlaceGQO, NodeGQO{

    private String address;
    private PlaceGQO containedInPlace;
    private Collection<PlaceGQO> containsPlaces;
    private GeoCoordinatesGQO geo;
    @javax.validation.constraints.NotNull
    private String id;

    public AdministrativeAreaGQO() {
    }

    public AdministrativeAreaGQO(String address, PlaceGQO containedInPlace, Collection<PlaceGQO> containsPlaces, GeoCoordinatesGQO geo, String id) {
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