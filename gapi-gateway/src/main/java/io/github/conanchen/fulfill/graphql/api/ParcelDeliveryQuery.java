package io.github.conanchen.fulfill.graphql.api;

import io.github.conanchen.fulfill.graphql.model.*;
import java.util.*;

public interface ParcelDeliveryQuery {

    ParcelDeliveryGQO parcelDelivery(String id, String parelId) throws Exception;

}