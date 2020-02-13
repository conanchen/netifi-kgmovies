package io.github.conanchen.shopping.graphql.api;

import java.util.*;
import io.github.conanchen.shopping.graphql.model.*;

public interface HousekeepingServiceQuery {

    HousekeepingServiceGQO housekeepingService(String id, String serviceID) throws Exception;

}