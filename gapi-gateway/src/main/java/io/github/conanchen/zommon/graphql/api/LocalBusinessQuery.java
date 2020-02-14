package io.github.conanchen.zommon.graphql.api;

import java.util.*;
import io.github.conanchen.zommon.graphql.model.*;

public interface LocalBusinessQuery {

    LocalBusinessGQO localBusiness(String id, String lbsID) throws Exception;

}