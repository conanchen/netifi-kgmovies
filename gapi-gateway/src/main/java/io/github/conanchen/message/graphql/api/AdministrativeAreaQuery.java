package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface AdministrativeAreaQuery {

    AdministrativeAreaGQO administrativeArea(String id, String defID) throws Exception;

}