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
public class ItemCategoryGQO implements NodeGQO{

    @lombok.NonNull
    private String itcgID;

    private String name;

    private String alternateName;

    private String description;

    private Integer orderQty;
    @lombok.NonNull
    private String id;

    public ItemCategoryGQO() {
    }

    public ItemCategoryGQO( String itcgID,  String name,  String alternateName,  String description,  Integer orderQty,  String id) {
        this.itcgID = itcgID;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.orderQty = orderQty;
        this.id = id;
    }

}