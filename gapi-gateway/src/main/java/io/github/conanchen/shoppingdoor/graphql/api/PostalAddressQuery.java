package io.github.conanchen.shoppingdoor.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

public interface PostalAddressQuery {

    PostalAddressGQO postalAddress(String id, String paID) throws Exception;

}