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
public class GeoCoordinatesGQO implements NodeGQO{


    private Integer elevation;

    private Integer latitude;

    private Integer longitude;

    private String postalCode;
    @lombok.NonNull
    private String id;

    public GeoCoordinatesGQO() {
    }

    public GeoCoordinatesGQO( Integer elevation,  Integer latitude,  Integer longitude,  String postalCode,  String id) {
        this.elevation = elevation;
        this.latitude = latitude;
        this.longitude = longitude;
        this.postalCode = postalCode;
        this.id = id;
    }

}