package io.github.conanchen.shopping.graphql.api;

import java.util.*;
import io.github.conanchen.shopping.graphql.model.*;

public interface ServiceQuery {

    ServiceGQO service(String id, String serviceID) throws Exception;

}