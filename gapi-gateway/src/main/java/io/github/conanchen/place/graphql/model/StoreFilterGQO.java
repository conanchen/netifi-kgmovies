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
public class StoreFilterGQO {

    @lombok.NonNull
    private Collection<String> id;

    private StringHashFilter_StringRegExpFilterGQO name;

    private StoreFilterGQO and;

    private StoreFilterGQO or;

    private StoreFilterGQO not;

    public StoreFilterGQO() {
    }

    public StoreFilterGQO( Collection<String> id,  StringHashFilter_StringRegExpFilterGQO name,  StoreFilterGQO and,  StoreFilterGQO or,  StoreFilterGQO not) {
        this.id = id;
        this.name = name;
        this.and = and;
        this.or = or;
        this.not = not;
    }

}