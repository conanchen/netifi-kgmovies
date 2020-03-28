package io.github.conanchen.gobject.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.gobject.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    GxcelObjectGQO gxcel(String id, String gxcelID, DataFetchingEnvironment env) throws Exception;
    GeneralObjectGQO generalObject(String id, String gID, DataFetchingEnvironment env) throws Exception;
    ImageObjectGQO imageObject(String id, String gID, DataFetchingEnvironment env) throws Exception;
    AudioObjectGQO audioObject(String id, String gID, DataFetchingEnvironment env) throws Exception;
    VideoObjectGQO videoObject(String id, String gID, DataFetchingEnvironment env) throws Exception;
    GObjectGQO gobject(String id, String gobjectID, DataFetchingEnvironment env) throws Exception;
}