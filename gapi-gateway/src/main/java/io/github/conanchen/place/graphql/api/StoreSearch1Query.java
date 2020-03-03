package io.github.conanchen.place.graphql.api;

import java.util.*;
import io.github.conanchen.place.graphql.model.*;

public interface StoreSearch1Query {

    Collection<StoreGQO> storeSearch1(StoreFilterGQO filter, StoreOrderGQO order, Integer first, Integer offset) throws Exception;

}