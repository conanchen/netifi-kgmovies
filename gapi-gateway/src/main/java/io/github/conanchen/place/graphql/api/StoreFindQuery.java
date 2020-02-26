package io.github.conanchen.place.graphql.api;

import java.util.*;
import io.github.conanchen.place.graphql.model.*;

public interface StoreFindQuery {

    StoreGQO storeFind(String id, String storeID) throws Exception;

}