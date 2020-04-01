package io.github.conanchen.place.graphql.model;

import java.util.*;
import io.github.conanchen.place.graphql.api.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class DefaultPlaceGQO implements PlaceGQO, NodeGQO{


    private String address;

    private PlaceGQO containedInPlace;

    private Collection<PlaceGQO> containsPlaces;

    private GeoCoordinatesGQO geo;
    @lombok.NonNull
    private String id;

    public DefaultPlaceGQO() {
    }

    public DefaultPlaceGQO( String address,  PlaceGQO containedInPlace,  Collection<PlaceGQO> containsPlaces,  GeoCoordinatesGQO geo,  String id) {
        this.address = address;
        this.containedInPlace = containedInPlace;
        this.containsPlaces = containsPlaces;
        this.geo = geo;
        this.id = id;
    }

}