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
public class GxcellGQO implements NodeGQO{


    private Integer colNo;

    private String value;

    private ThingGQO valueFrom;

    private String valueFormula;

    private PersonGQO editingBy;

    private java.util.Date editingStarted;

    private PersonGQO creator;

    private java.util.Date dateCreated;

    private java.util.Date dateModified;
    @lombok.NonNull
    private String id;

    public GxcellGQO() {
    }

    public GxcellGQO( Integer colNo,  String value,  ThingGQO valueFrom,  String valueFormula,  PersonGQO editingBy,  java.util.Date editingStarted,  PersonGQO creator,  java.util.Date dateCreated,  java.util.Date dateModified,  String id) {
        this.colNo = colNo;
        this.value = value;
        this.valueFrom = valueFrom;
        this.valueFormula = valueFormula;
        this.editingBy = editingBy;
        this.editingStarted = editingStarted;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.id = id;
    }

}