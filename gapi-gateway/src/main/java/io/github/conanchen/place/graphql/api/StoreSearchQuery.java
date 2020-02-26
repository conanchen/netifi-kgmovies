package io.github.conanchen.place.graphql.api;

import java.util.*;
import io.github.conanchen.place.graphql.model.*;

public interface StoreSearchQuery {

    StoresConnectionGQO storeSearch(StoreFilterGQO filter, StoreOrderGQO order, Integer first, Integer offset) throws Exception;

}