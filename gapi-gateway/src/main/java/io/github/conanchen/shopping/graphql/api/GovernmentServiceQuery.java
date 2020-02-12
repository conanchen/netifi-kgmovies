package io.github.conanchen.shopping.graphql.api;

import java.util.*;
import io.github.conanchen.shopping.graphql.model.*;

public interface GovernmentServiceQuery {

    GovernmentServiceGQO governmentService(String id, String serviceID) throws Exception;

}