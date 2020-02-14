package io.github.conanchen.zommon.graphql.api;

import java.util.*;
import io.github.conanchen.zommon.graphql.model.*;

public interface AllLocalBusinessQuery {

    LocalBusinessConnectionGQO allLocalBusiness(String after, Integer first, String before, Integer last) throws Exception;

}