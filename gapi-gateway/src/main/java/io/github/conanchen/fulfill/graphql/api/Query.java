package io.github.conanchen.fulfill.graphql.api;

import io.github.conanchen.fulfill.graphql.model.*;
import java.util.*;

public interface Query {

    ParcelDeliveryGQO parcelDelivery(String id, String parelId) throws Exception;

    HomeserviceDeliveryGQO homeserviceDelivery(String id, String srvId) throws Exception;

}