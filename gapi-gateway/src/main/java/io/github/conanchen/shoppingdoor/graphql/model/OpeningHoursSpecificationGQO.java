package io.github.conanchen.shoppingdoor.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class OpeningHoursSpecificationGQO implements NodeGQO{


    private String name;

    private String alternateName;

    private String description;

    private java.util.Date closes;

    private java.util.Date opens;

    private java.util.Date validFrom;

    private java.util.Date validThrough;
    @lombok.NonNull
    private String id;

    public OpeningHoursSpecificationGQO() {
    }

    public OpeningHoursSpecificationGQO( String name,  String alternateName,  String description,  java.util.Date closes,  java.util.Date opens,  java.util.Date validFrom,  java.util.Date validThrough,  String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.closes = closes;
        this.opens = opens;
        this.validFrom = validFrom;
        this.validThrough = validThrough;
        this.id = id;
    }

}