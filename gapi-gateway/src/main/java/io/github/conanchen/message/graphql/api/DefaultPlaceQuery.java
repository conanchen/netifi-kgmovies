package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface DefaultPlaceQuery {

    DefaultPlaceGQO defaultPlace(String id, String defID) throws Exception;

}