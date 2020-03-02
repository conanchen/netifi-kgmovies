package io.github.conanchen.place.graphql.api;

import java.util.*;
import io.github.conanchen.place.graphql.model.*;

public interface StoreSearchQuery {

    StoreConnectionGQO storeSearch(StoreFilterGQO filter, StoreOrderGQO order, String after, Integer first, String before, Integer last) throws Exception;

}