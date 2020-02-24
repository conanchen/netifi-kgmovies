package io.github.conanchen.gobject.graphql.model;

import io.github.conanchen.personorg.graphql.model.PersonGQO;

public interface GObjectGQO {

    String getName();

    PersonGQO getCreator();

    java.util.Date getDateCreated();

    java.util.Date getDateModified();

}