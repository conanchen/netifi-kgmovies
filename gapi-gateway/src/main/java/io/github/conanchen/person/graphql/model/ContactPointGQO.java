package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.person.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class ContactPointGQO implements NodeGQO{


    private java.lang.String areaServed;

    private String email;

    private String faxNumber;

    private OpeningHoursSpecificationGQO hoursAvailable;

    private String telephone;
    @lombok.NonNull
    private String id;

    public ContactPointGQO() {
    }

    public ContactPointGQO( java.lang.String areaServed,  String email,  String faxNumber,  OpeningHoursSpecificationGQO hoursAvailable,  String telephone,  String id) {
        this.areaServed = areaServed;
        this.email = email;
        this.faxNumber = faxNumber;
        this.hoursAvailable = hoursAvailable;
        this.telephone = telephone;
        this.id = id;
    }

}