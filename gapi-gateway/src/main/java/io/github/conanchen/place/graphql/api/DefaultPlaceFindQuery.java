package io.github.conanchen.place.graphql.api;

import java.util.*;
import io.github.conanchen.place.graphql.model.*;

public interface DefaultPlaceFindQuery {

    DefaultPlaceGQO defaultPlaceFind(String id, String defID) throws Exception;

}