package io.github.conanchen.shopping.graphql.api;

import java.util.*;
import io.github.conanchen.shopping.graphql.model.*;

public interface OfferQuery {

    OfferGQO offer(String id, String offerID) throws Exception;

}