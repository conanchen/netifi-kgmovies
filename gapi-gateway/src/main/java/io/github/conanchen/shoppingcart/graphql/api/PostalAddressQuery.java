package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface PostalAddressQuery {

    PostalAddressGQO postalAddress(String id, String paID) throws Exception;

}