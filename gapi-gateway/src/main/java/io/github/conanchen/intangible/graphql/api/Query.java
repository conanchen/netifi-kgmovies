package io.github.conanchen.intangible.graphql.api;

import java.util.*;
import io.github.conanchen.intangible.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    public Connection<BrandGQO> allBrand(String after, Integer first, String before, Integer last, DataFetchingEnvironment env);
    BrandGQO brand(String id, String brandID, DataFetchingEnvironment env) throws Exception;
}