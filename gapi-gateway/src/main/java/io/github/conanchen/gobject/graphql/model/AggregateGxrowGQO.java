package io.github.conanchen.gobject.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.gobject.graphql.api.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class AggregateGxrowGQO implements NodeGQO{


    private String name;

    private Collection<GxrowGQO> rows;
    @lombok.NonNull
    private String id;

    public AggregateGxrowGQO() {
    }

    public AggregateGxrowGQO( String name,  Collection<GxrowGQO> rows,  String id) {
        this.name = name;
        this.rows = rows;
        this.id = id;
    }

}