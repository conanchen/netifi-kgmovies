package io.github.conanchen.place.graphql.api;

import java.util.*;
import io.github.conanchen.place.graphql.model.*;

public interface LocalBusinessQuery {

    LocalBusinessGQO localBusiness(String id, String lbsID) throws Exception;

}