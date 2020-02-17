package io.github.conanchen.place.graphql.api;

import java.util.*;
import io.github.conanchen.place.graphql.model.*;

public interface AdministrativeAreaQuery {

    AdministrativeAreaGQO administrativeArea(String id, String defID) throws Exception;

}