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
public class GxcolDefGQO {


    private Integer colNo;

    private String name;

    private GxcolTypeGQO type;

    public GxcolDefGQO() {
    }

    public GxcolDefGQO( Integer colNo,  String name,  GxcolTypeGQO type) {
        this.colNo = colNo;
        this.name = name;
        this.type = type;
    }

}