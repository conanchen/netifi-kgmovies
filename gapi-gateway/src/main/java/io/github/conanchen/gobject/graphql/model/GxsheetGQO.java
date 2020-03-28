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
public class GxsheetGQO implements NodeGQO{


    private String name;

    private Collection<GxcolDefGQO> columndefs;

    private Collection<AggregateGxrowGQO> aggregateRows;

    private PersonGQO creator;

    private java.util.Date dateCreated;

    private java.util.Date dateModified;
    @lombok.NonNull
    private String id;

    public GxsheetGQO() {
    }

    public GxsheetGQO( String name,  Collection<GxcolDefGQO> columndefs,  Collection<AggregateGxrowGQO> aggregateRows,  PersonGQO creator,  java.util.Date dateCreated,  java.util.Date dateModified,  String id) {
        this.name = name;
        this.columndefs = columndefs;
        this.aggregateRows = aggregateRows;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.id = id;
    }

}