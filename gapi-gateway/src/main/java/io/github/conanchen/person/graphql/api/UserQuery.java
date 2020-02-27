package io.github.conanchen.person.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;

public interface UserQuery {

    UserGQO user(String id, String uId) throws Exception;

}