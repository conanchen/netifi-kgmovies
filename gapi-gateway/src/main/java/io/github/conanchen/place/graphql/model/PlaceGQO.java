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

public interface PlaceGQO {

    String getAddress();

    PlaceGQO getContainedInPlace();

    Collection<PlaceGQO> getContainsPlaces();

    GeoCoordinatesGQO getGeo();

}