package io.github.conanchen.gobject.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.gobject.graphql.api.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

public interface GObjectGQO {

    String getName();

    PersonGQO getCreator();

    java.util.Date getDateCreated();

    java.util.Date getDateModified();

}