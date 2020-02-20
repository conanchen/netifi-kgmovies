package io.github.conanchen.creativework.graphql.api;

import java.util.*;
import io.github.conanchen.creativework.graphql.model.*;

public interface Query {

    BlogGQO blog(String id, String blogId) throws Exception;

}