package io.github.conanchen.gobject.graphql.model;

import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.person.graphql.model.PersonGQO;

public interface GObjectGQO {

    String getName();

    PersonGQO getCreator();

    java.util.Date getDateCreated();

    java.util.Date getDateModified();

}