package io.github.conanchen.fulfill.graphql.api;

import io.github.conanchen.fulfill.graphql.model.*;
import java.util.*;

public interface HomeserviceDeliveryQuery {

    HomeserviceDeliveryGQO homeserviceDelivery(String id, String srvId) throws Exception;

}