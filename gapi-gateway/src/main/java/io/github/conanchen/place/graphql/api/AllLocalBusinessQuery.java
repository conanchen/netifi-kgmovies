package io.github.conanchen.place.graphql.api;

import java.util.*;
import io.github.conanchen.place.graphql.model.*;

public interface AllLocalBusinessQuery {

    LocalBusinessConnectionGQO allLocalBusiness(String after, Integer first, String before, Integer last) throws Exception;

}