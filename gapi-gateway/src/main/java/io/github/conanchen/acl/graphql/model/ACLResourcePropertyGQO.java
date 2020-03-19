package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.acl.graphql.api.*;
import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ACLResourcePropertyGQO {

    @javax.validation.constraints.NotNull
    private ACLPermitTypeGQO permit;
    @javax.validation.constraints.NotNull
    private ACLAccessTypeGQO act;
    @javax.validation.constraints.NotNull
    private String propertyName;

    public ACLResourcePropertyGQO() {
    }

    public ACLResourcePropertyGQO( ACLPermitTypeGQO permit,  ACLAccessTypeGQO act,  String propertyName) {
        this.permit = permit;
        this.act = act;
        this.propertyName = propertyName;
    }

}